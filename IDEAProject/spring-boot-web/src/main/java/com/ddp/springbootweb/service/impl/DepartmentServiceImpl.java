package com.ddp.springbootweb.service.impl;

import com.ddp.springbootweb.mapper.DepartmentMapper;
import com.ddp.springbootweb.pojo.Department;
import com.ddp.springbootweb.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

/**
 *
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    DepartmentMapper departmentMapper;

    /**
     * 获取所有部门信息
     *
     * @return
     */
    @Override
    public Collection<Department> selDepartments() {
        return departmentMapper.selDepartments();
    }

    /**
     * 通过ID查询部门
     *
     * @param depId
     * @return
     */
    @Override
    public Department queryDepById(Integer depId) {
        return departmentMapper.selDepartById(depId);
    }
}
