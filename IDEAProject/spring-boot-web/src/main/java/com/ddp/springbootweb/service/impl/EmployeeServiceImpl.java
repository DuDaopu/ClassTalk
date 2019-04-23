package com.ddp.springbootweb.service.impl;

import com.ddp.springbootweb.mapper.EmployeeMapper;
import com.ddp.springbootweb.pojo.Employee;
import com.ddp.springbootweb.service.EmployService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 员工业务逻辑
 *
 * @author 杜先森
 */
@Service
public class EmployeeServiceImpl implements EmployService {
    @Resource
    EmployeeMapper employeeMapper;

    /**
     * 查询所有员工
     *
     * @return
     */
    @Override
    public List<Employee> getAll() {
        return employeeMapper.getAll();
    }

    /**
     * 通过Id获取员工
     *
     * @param id
     * @return
     */
    @Override
    public Employee getById(Integer id) {
        return employeeMapper.get(id);
    }

    /**
     * 添加员工
     *
     * @param employee
     * @return
     */
    @Override
    public int addEmp(Employee employee) {
        return employeeMapper.insEmp(employee);
    }

    /**
     * 通过Id删除员工
     *
     * @param id
     * @return
     */
    @Override
    public int delete(Integer id) {
        return employeeMapper.delete(id);
    }

    /**
     * 更改员工信息
     *
     * @param employee
     * @return
     */
    @Override
    public int changeEmp(Employee employee) {
        return employeeMapper.updEmpById(employee);
    }
}
