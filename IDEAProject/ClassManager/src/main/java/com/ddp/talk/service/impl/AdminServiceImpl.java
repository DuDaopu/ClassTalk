package com.ddp.talk.service.impl;

import com.ddp.talk.mapper.StudentMapper;
import com.ddp.talk.pojo.Student;
import com.ddp.talk.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public int addUsers(Student stu) {
        return studentMapper.insStudent(stu);
    }

    @Override
    public int delUsers(int id) {
        return studentMapper.delStudentById(id);
    }

    @Override
    public int editUsers(Student stu) {
        return studentMapper.updStudentById(stu);
    }

}
