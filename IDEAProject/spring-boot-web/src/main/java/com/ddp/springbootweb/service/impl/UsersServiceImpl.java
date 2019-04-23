package com.ddp.springbootweb.service.impl;

import com.ddp.springbootweb.mapper.UserMapper;
import com.ddp.springbootweb.pojo.Users;
import com.ddp.springbootweb.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户业务实现
 *
 * @author 杜先森
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    UserMapper userMapper;

    /**
     * 用户登陆
     *
     * @param users
     * @return
     */
    @Override
    public Users login(Users users) {
        return userMapper.selUser(users);
    }
}
