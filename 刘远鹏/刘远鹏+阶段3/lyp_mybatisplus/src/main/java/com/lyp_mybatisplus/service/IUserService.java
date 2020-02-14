package com.lyp_mybatisplus.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyp_mybatisplus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2020-02-10
 */
public interface IUserService extends IService<User> {
    //插入
    int  insert();

    //查询全部
    List<User> selectAll();

    //据ID而查
    User  selectById(Integer id);

    //根据username条件查
    List<User> selectByMap(String username);

    //根据条件更改
    int update();

    // 跟据条件删除相关用户
    int deleteById(int id);

    //分页查询
    IPage<User> selectUserPage();
}
