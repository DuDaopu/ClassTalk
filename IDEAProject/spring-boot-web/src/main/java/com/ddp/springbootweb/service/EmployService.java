package com.ddp.springbootweb.service;

import com.ddp.springbootweb.pojo.Employee;

import java.util.List;

/**
 * 员工业务接口
 *
 * @author 杜先森
 */
public interface EmployService {
    /**
     * 查询所有员工
     *
     * @return
     */
    List<Employee> getAll();

    /**
     * 通过ID查询员工
     *
     * @param id
     * @return
     */
    Employee getById(Integer id);

    /**
     * 添加员工
     *
     * @param employee
     * @return
     */
    int addEmp(Employee employee);

    /**
     * 通过Id删除员工
     *
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 修改员工
     *
     * @param employee
     * @return
     */
    int changeEmp(Employee employee);

}
