package com.ddp.springbootweb.service;

import com.ddp.springbootweb.pojo.Users;

/**
 * 用户业务接口
 *
 * @author 杜先森
 */
public interface UsersService {
    /**
     * 用户登陆
     *
     * @param users
     * @return
     */
    Users login(Users users);
}
