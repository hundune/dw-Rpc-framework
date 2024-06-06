package com.dwpj.dwrpc.example.consumer;

import com.dwpj.dwrpc.model.User;
import com.dwpj.dwrpc.proxy.ServiceProxyFactory;
import com.dwpj.dwrpc.service.UserService;

/**
 * @hundune~
 * @version1.0
 */
public class ExampleConsumer {
    public static void main(String[] args) {

        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setUserName("dwbi");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getUserName());
        } else {
            System.out.println("user == null");
        }
    }
}
