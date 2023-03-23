package edu.wbu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.wbu.dao")
public class EpithesisApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpithesisApplication.class, args);
    }

}
