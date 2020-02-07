package com.yuliang0u0.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author yuliang0u0
 * @date 2020/2/7 - 19:22
 */
@RestController
public class JDBCController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/accountList")
    public List<Map<String,Object>> getAccountList(){
        String sql = "select * from account";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

    @GetMapping("/add")
    public String addAccount(){
        String sql = "insert into account values(3,'wangwu',2000)";
        jdbcTemplate.update(sql);
        return "添加成功！";
    }


    @GetMapping("/delete")
    public String deleteAccount(){
        String sql = "delete from account where id = ?";
        jdbcTemplate.update(sql,3);
        return "删除成功！";
    }

    @GetMapping("/update")
    public String updateAccount(){
        String sql = "update account set balance = ? where id = ?";
        jdbcTemplate.update(sql,1000,1);
        return "更新成功";
    }
}
