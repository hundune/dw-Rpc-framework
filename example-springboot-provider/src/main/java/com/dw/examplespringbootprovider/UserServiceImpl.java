package com.dw.examplespringbootprovider;

import com.dw.dwrpc.springboot.starter.annotation.RpcService;
import com.dwpj.dwrpc.model.User;
import com.dwpj.dwrpc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @hundune~
 * @version1.0
 */
@Service
@RpcService
public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getUserName());
        return user;
    }
}