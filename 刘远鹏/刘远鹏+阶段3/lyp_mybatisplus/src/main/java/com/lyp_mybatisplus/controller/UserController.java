package com.lyp_mybatisplus.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyp_mybatisplus.entity.User;

import com.lyp_mybatisplus.mapper.UserMapper;
import com.lyp_mybatisplus.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2020-02-10
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    //添加用户
    @RequestMapping("/insert")
    @ResponseBody
    public String insert() {
        int res=iUserService.insert();
        return res==1 ? "insert  success!" : "insert  fail!";

    }
    //查询所有
    @GetMapping("/selectAll")
    @ResponseBody
    public List<User> selectAll(){
           return iUserService.selectAll();
    }
    //查询特定id的用户
    @GetMapping("/selectById/{id}")
    @ResponseBody
    public User selectById(@PathVariable("id") Integer id){
        return iUserService.selectById(id);
    }
    //查询特定username的用户
    @GetMapping("/selectByMap/{username}")
    @ResponseBody
    public List<User> selectByMap(@PathVariable("username") String username) {
        return iUserService.selectByMap(username);
    }
    //修改update
    @GetMapping("/update")
    @ResponseBody
    public String update( ) {
        int res=iUserService.update();
        return  res==1 ? "update  success!" : "update  fail!";
    }
    //按ID删除用户
    @GetMapping("/deleteById/{id}")
    @ResponseBody
    public String deleteById(@PathVariable("id") int id){
        int res=iUserService.deleteById(id);
        return  res==1 ? "delete  success!" : "delete  fail!";
    }
    //分页查询
    @GetMapping("/page")
    @ResponseBody
    public IPage<User> selectUserPage(){
        return iUserService.selectUserPage();
    }
}

