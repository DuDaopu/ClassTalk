package com.ddp.springbootweb.mapper;

import com.ddp.springbootweb.pojo.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户映射
 *
 * @author 杜先森
 */
public interface UserMapper {
    /**
     * 根据用户名和密码查询用户是否存在
     *
     * @param u
     * @return
     */
    @Select("select username,password from users where username=#{u.userName} and password=#{u.password}")
    Users selUser(@Param("u") Users u);

}
