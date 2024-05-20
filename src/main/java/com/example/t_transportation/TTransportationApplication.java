package com.example.t_transportation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.t_transportation.mapper.AdminMapper")
public class TTransportationApplication {

    public static void main(String[] args) {
        SpringApplication.run(TTransportationApplication.class, args);
    }

}
