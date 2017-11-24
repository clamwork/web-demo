package com.djcps.module.system.service;

import com.djcps.module.system.mapper.UserMapper;
import com.djcps.module.system.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户service
 * @author Chengw
 * @since 2017/11/24 13:29.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /***
     *
     * @return
     */
    public List<User> list(){
        return userMapper.list();
    }
}
