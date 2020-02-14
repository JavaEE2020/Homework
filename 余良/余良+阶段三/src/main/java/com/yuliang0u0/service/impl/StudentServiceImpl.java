package com.yuliang0u0.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuliang0u0.entity.Student;
import com.yuliang0u0.mapper.StudentMapper;
import com.yuliang0u0.service.IStudentService;
import org.springframework.stereotype.Service;

/**
 * @author yuliang0u0
 * @date 2020/2/14 - 15:03
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
    @Override
    public Object findList(IPage<Student> page) {
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        IPage<Student> userIPage = baseMapper.selectPage(page, wrapper);
        return userIPage;
    }
}
