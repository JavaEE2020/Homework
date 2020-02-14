package com.mypack.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mypack.entity.Student;
import com.mypack.mapper.StudentMapper;
import com.mypack.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Override
    public void insert(Student student) {
        baseMapper.insert(student);
    }
}
