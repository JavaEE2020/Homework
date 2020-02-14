package com.lyp_mybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public  class CodeGenerator{
    public void Generator(){
        //创建代码生成器
        AutoGenerator mpg=new AutoGenerator();
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");//获取当前项目的路径
        gc.setOutputDir(projectPath + "/src/main/java");
        mpg.setGlobalConfig(gc);


        //数据库配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)    //设置数据库类型
                .setDriverName("com.mysql.jdbc.Driver")      //设置数据驱动
                .setUrl("jdbc:mysql://localhost:3306/mybatis_plus?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8")         //设置数据库url
                .setUsername("root")    //设置用户名
                .setPassword("1234");    //设置密码
        mpg.setDataSource(dataSourceConfig);


        //包名策略配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.lyp_mybatisplus")      //全局父包
                .setController("controller")
                .setService("service")
                // .setServiceImpl("service.impl")
                .setMapper("mapper")    //dao接口
                .setXml("mapperXml")       //mapper映射文件
                .setEntity("entity");
        mpg.setPackageInfo(packageConfig);

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("user"); //需要生成的表,映射
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名方法：驼峰命名法
        mpg.setStrategy(strategyConfig);


        // 执行
        mpg.execute();

    }
}
