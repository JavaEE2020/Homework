package com.fcf.controller;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动类
 * <p>Title: SpringbootApplication</p>
 */
@SpringBootApplication(scanBasePackages = {"com.fcf"})
@MapperScan("com.liyan.mapper")
@EnableTransactionManagement//开启事务管理
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
