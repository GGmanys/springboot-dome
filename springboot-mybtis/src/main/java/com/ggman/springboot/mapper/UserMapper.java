package com.ggman.springboot.mapper;

import com.ggman.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * mapper 表达式
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 登录
     */
    @Select("SELECT  id  from user where user_name=#{username}and user_password=#{userpassword}")
    Long login(User user);
}
