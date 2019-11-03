package com.ggman.springboot.service;


import com.ggman.springboot.bean.Info;
import com.ggman.springboot.bean.User;
import com.ggman.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    /**
     * 登录
     */
    @Autowired
    UserMapper userMapper;
    public Info login(User user){
        Info info = new Info();
        info.setStatus(false);  //设置为false 登录状态
        info.setDetail(null);
        try {
            Long login = userMapper.login(user);
            if(login==null){
                info.setMsg("用户名或者密码错误");
            }else{
                info.setMsg("登录成功");
                user.getId();
                info.setDetail(user);
            }
        }catch (Exception e ){
            info.setMsg(e.getMessage());
            e.printStackTrace();
        }

        return info;
    }
}
