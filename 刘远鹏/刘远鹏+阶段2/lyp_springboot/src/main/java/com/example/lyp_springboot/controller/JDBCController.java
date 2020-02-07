package com.example.lyp_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //查询数据库的所有信息
    @GetMapping("/userList")
    public List<Map<String,Object>> userList(){
        String sql="select *from t_user";
        List<Map<String,Object>> list_maps=jdbcTemplate.queryForList(sql);
        return list_maps ;
    }
    //添加用户
    @GetMapping("/addUser")
    public String addUser(){
        String sql="insert into t_user(id,username,jobs,phone) values (10,'新人','学生','12345678910')";
        jdbcTemplate.update(sql);
        return "insert success!";
    }
    //修改用户信息
    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id")int id){
        String sql="update t_user set username=?,jobs=?,phone=? where id="+id;
        Object[] objects=new Object[3];
        objects[0]="改名";
        objects[1]="学生";
        objects[2]="12345678901";
        jdbcTemplate.update(sql,objects);
        return "update success!";
    }
    //删除用户信息
    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id){
        String sql="delete from t_user where id=?";
        jdbcTemplate.update(sql,id);
        return "delete success!";
    }
}
