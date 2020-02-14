package com.lyp_mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.lyp_mybatisplus.mapper")
public class LypMybatisplusApplication {

    public static void main(String[] args) {

        SpringApplication.run(LypMybatisplusApplication.class, args);
    }

}
