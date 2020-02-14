package com.fcf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//加载mybits的mapper接口所在的路径
@MapperScan("com.fcf.dao")
public class MavenTest_2Application {

    public static void main(String[] args) {
        SpringApplication.run(MavenTest_2Application.class, args);
    }

}
