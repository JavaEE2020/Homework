package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.dao.StudentMapper;
import com.mypack.entity.Student;

@Transactional
@Service
@ComponentScan("com.mypack.dao")
public class StudentServiceImpl implements StudentServiceIF {


    @Autowired
    StudentMapper studentMapper;

    //查询所有学生
    @Override
    public List<Student> queryAllStu(){
        return studentMapper.queryAllStu();
    }
}


