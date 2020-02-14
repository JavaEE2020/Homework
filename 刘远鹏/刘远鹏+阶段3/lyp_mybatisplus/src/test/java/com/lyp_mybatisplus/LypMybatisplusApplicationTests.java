package com.lyp_mybatisplus;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
class LypMybatisplusApplicationTests {

    @Test
    void contextLoads() {
    }

    //通过 AutoGenerator 可以快速生成 Entity、Mapper、Mapper XML、Service、Controller 等各个模块的代码
    @Test
    public void CodeGenerator(){
        CodeGenerator codeGenerator=new CodeGenerator();
        codeGenerator.Generator();

    }


}

