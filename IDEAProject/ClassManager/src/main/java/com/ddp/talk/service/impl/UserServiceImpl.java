package com.ddp.talk.service.impl;

import com.ddp.talk.mapper.StudentMapper;
import com.ddp.talk.pojo.Student;
import com.ddp.talk.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> select() {
        return studentMapper.selAll();
    }

    @Override
    public Student selectid(int id) {
        return studentMapper.selById(id);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.updContentById(student);
    }
}
