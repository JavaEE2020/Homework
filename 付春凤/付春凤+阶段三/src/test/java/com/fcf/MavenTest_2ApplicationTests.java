package com.fcf;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fcf.dao.UserMapper;
import com.fcf.entity.Student;
import com.fcf.entity.User;
import com.fcf.service.StudentService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

public class MavenTest_2ApplicationTests {
    @Resource
    private UserMapper userMapper;

    @Resource
    private StudentService studentService;
    /**
    *查询所有
     */
    @Test
    public void contextLoads(){
        //调用查询所有用户的方法
        List<User> userList = userMapper.selectList(null);
        for (User user : userList){
            System.out.println(user);
//            System.out.println("null");
        }
    }

    /**
     * 测试新增
     */
    @Test
    public void testInsert(){
        User user = new User();
        user.setAge(20);
        user.setEmail("candy@qq.com");
        user.setName("candy");
        int count = userMapper.insert(user);
        if (count>0){
            System.out.println("新增成功");
            System.out.println("当前用户主键：" + user.getId());
        }else {
            System.out.println("新增失败");
        }
    }

    /**
     * 测试删除，根据主键id删除
     */
    @Test
    public void testDeleteById(){
        if (userMapper.deleteById(2)>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
    /**
     * 测试删除,根据调剂构造器中的条件删除
     */
    @Test
    public void testDelete(){
        //创建条件构造对象
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("id",3);
        if (userMapper.delete(queryWrapper)>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }

    /**
     * 根据逐渐id修改
     */
    @Test
    public void testUpdateById(){
        User user = new User();
        user.setAge(10);
        user.setEmail("candy@163.com");
        user.setName("candy");
        user.setId(5);
        int count = userMapper.updateById(user);
        if (count>0){
            System.out.println("更新成功");
        }else {
            System.out.println("更新失败");
        }
    }
    /**
     * 根据构造器中的条件修改
     */
    @Test
    public void testUpdate(){
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<User>();
        updateWrapper.eq("id",5);
        User user = new User();
        user.setAge(10);
        user.setEmail("candy@163.com");
        user.setName("candy");
        int count = userMapper.update(user,updateWrapper);
        if (count>0){
            System.out.println("更新成功");
        }else {
            System.out.println("更新失败");
        }
    }

    /**
     * 根据主键查询
     */
    @Test
    public void testSelectById(){
        User user = userMapper.selectById(1);
        System.out.println(user);

    }
    /**
     * 根据多个主键批量查询
     */
    @Test
    public void testSelectBatchIds(){
        List<User> user = userMapper.selectBatchIds(Arrays.asList(1,2,3,4));
        for (User user1:user){
            System.out.println(user1);
        }
    }

    @Test
    public void testSelectPage(){
        //创建分页对象
        Page<User> page = new Page<User>(1,2);
        //创建分页查询方法
        IPage<User> iPage = userMapper.selectPage(page, null);
        System.out.println("当前页码:"+iPage.getCurrent());
        System.out.println("每页大小:"+iPage.getSize());
        System.out.println("总记录数:"+iPage.getTotal());
        System.out.println("总页数:"+iPage.getPages());
        //获取用户列表
        List<User> userList = iPage.getRecords();
        for (User user:userList){
            System.out.println(user);
        }
    }

    @Test
    public void testSave(){
        Student stu = new Student();
        stu.setAge(19);
        stu.setEmail("lucy@qq.com");
        stu.setName("lucy");
        if (studentService.save(stu)){
            System.out.println("成功");
        }else{
            System.out.println("失败");
        }
    }

}
