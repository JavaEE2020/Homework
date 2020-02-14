package com.fcf;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

public class TestMP {
    private static String author ="fuchunfeng";//作者名称
    private static String outputDir ="E:\\workplace\\IDEA\\mybitsplus_2\\src\\main\\java";//生成的位置
    private static String driver ="com.mysql.jdbc.Driver";
    private static String url ="jdbc:mysql://localhost:3306/mp?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    private static String username ="root";
    private static String password ="123456";
    private static String tablePrefix ="f_";//数据库表的前缀r
    private static String [] tables = {"f_user","student"};
    private static String parentPackage = "com.fcf";
    private static String dao = "dao";
    private static String service = "service";
    private static String entity = "entity";
    private static String controller = "controller";
    private static String mapperxml = "mapper";


    /**
     * 代码生成
     */
    @Test
    public void  testGenerator() {
        //1. 全局配置
        GlobalConfig config = new GlobalConfig();
        config.setAuthor(author) // 作者
                .setOutputDir(outputDir) // 生成路径
                .setFileOverride(true)  // 文件覆盖
                .setIdType(IdType.AUTO) // 主键策略
                .setServiceName("%sService")  // 设置生成的service接口的名字的首字母是否为I，加%s则不生成I
                .setBaseResultMap(true)	//映射文件中是否生成ResultMap配置
                .setBaseColumnList(true);	//生成通用sql字段

        //2. 数据源配置
        DataSourceConfig dsConfig  = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)  // 设置数据库类型
                .setDriverName(driver)	//设置驱动
                .setUrl(url)			//设置连接路径
                .setUsername(username)	//设置用户名
                .setPassword(password);	//设置密码

        //3. 策略配置
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true) //全局大写命名
                .setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
                .setTablePrefix(tablePrefix) //表前缀
                .setInclude(tables);  // 生成的表

        //4. 包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent(parentPackage)//顶级包结构
                .setMapper(dao)	//数据访问层
                .setService(service)	//业务逻辑层
                .setController(controller)	//控制器
                .setEntity(entity)	//实体类
                .setXml(mapperxml);	//mapper映射文件

        //5. 整合配置
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);
        //6. 执行
        ag.execute();
    }
}
