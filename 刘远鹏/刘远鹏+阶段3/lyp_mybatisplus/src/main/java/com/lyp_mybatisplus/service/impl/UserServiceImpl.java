package com.lyp_mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyp_mybatisplus.entity.User;
import com.lyp_mybatisplus.mapper.UserMapper;
import com.lyp_mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2020-02-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert() {
        User  user = new User();
        // user.setId(9);  因为设置了自增，这句话无效
        user.setJobs("学生");
        user.setUsername("新Plus者1");
        user.setPhone("12345678901");
        return userMapper.insert(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectList( null);
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> selectByMap(String username) {
        Map<String,Object> columnMap=new HashMap<>();
        columnMap.put("username","小明");
        return userMapper.selectByMap(columnMap);
    }

    @Override
    public int update() {
        //修改值
        User user = new User();
        user.setUsername("修改张三");

        //修改条件
        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
        userUpdateWrapper.eq("id", "4");
        return userMapper.update(user, userUpdateWrapper);

    }

    @Override
    public int deleteById(int id) {
       return userMapper.deleteById(id);
    }

    @Override
    public IPage<User> selectUserPage() {
        Page<User> page=new Page<>(2,5);
        return userMapper.selectPage(page,null);
    }
}
