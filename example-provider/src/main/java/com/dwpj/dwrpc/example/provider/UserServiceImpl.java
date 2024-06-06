package com.dwpj.dwrpc.example.provider;

import com.dwpj.dwrpc.model.User;
import com.dwpj.dwrpc.service.UserService;

/**
 * @hundune~
 * @version1.0
 */
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(User user) {
        System.out.println(user.getUserName());
        return user;
    }
}
