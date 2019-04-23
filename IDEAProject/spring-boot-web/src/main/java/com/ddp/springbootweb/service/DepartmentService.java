package com.ddp.springbootweb.service;

import com.ddp.springbootweb.pojo.Department;

import java.util.Collection;

/**
 * 部门业务接口
 *
 * @author 杜先森
 */
public interface DepartmentService {
    /**
     * 查询所有部门
     *
     * @return
     */
    Collection<Department> selDepartments();

    /**
     * 通过Id查询部门
     *
     * @param depId
     * @return
     */
    Department queryDepById(Integer depId);
}
