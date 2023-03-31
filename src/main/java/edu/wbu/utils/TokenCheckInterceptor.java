package edu.wbu.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.wbu.pojo.ResultVO;
import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author yog
 * @create 2023-03-2023/3/29-10:51
 */
@Component
public class TokenCheckInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //1.预检请求要放行
        // http请求方式常用的有5中：POST\GET\DELETE\PUT   OPTIONS
        String method = request.getMethod();  //获取请求方式
        if("OPTIONS".equals(method)){
            return true;
        }
        //2、从请求头中获取token
        String token = request.getHeader("token");
        if(token == null){
            //2、如果token==null表示前端没有传递token，提示请先登录
            doResponse(response,10001, "请先登录！");
            return false;
        }else{
            try {
                //3、表示虽然传递了token，但是token不合法（真实性、是否过期）
                JwtParser parser = Jwts.parser();
                //解析器设置key，此key必须与生成token字符串时设置的key一致
                parser.setSigningKey("yogpop");
                //验证token，如果token合法则正常执行；如果token不合法则抛出异常
                Jws<Claims> claimsJws = parser.parseClaimsJws(token);
                //如果不出现异常，则表示token合法
                return true;
            }catch ( ExpiredJwtException e){
                doResponse(response,10002, "登录过期，请重新登录");
                return false;
            }catch (UnsupportedJwtException e){
                doResponse(response,10003,"Token不合法，请自重！");
                return false;
            }catch (Exception e){
                doResponse(response,10004, "请重新登录！");
                return false;
            }
        }
    }

    private void doResponse(HttpServletResponse response, int code, String msg) throws Exception{
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        ResultVO vo = new ResultVO(code, msg, null);
        PrintWriter writer = response.getWriter();
        writer.print( new ObjectMapper().writeValueAsString(vo) );
        writer.flush();
        writer.close();
    }

}
