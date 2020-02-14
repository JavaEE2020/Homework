package com.fcf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fcf.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
*自定义UserMapper接口，若想使用MP提供的CRUD功能，需要继承Basemapper<T>
 */

public interface UserMapper extends BaseMapper<User> {
    /**
     * 分页查询用户列表
     * @return
     */
    @Select("select * from f_user")
    List<User> findUserList();

    @Select("select * from f_user")
    IPage<User> findUserListByPage(Page<User> page);
}
