package com.dwpj.dwrpc.example.consumer;

import com.dwpj.dwrpc.bootstrap.ConsumerBootstrap;
import com.dwpj.dwrpc.config.RpcConfig;
import com.dwpj.dwrpc.model.User;
import com.dwpj.dwrpc.proxy.ServiceProxyFactory;
import com.dwpj.dwrpc.service.UserService;
import com.dwpj.dwrpc.utils.ConfigUtils;

/**
 * @hundune~
 * @version1.0
 */
public class ConsumerExample {
    public static void main(String[] args) {
        // 服务提供者初始化
        ConsumerBootstrap.init();

        // 获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setUserName("yupi");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getUserName());
        } else {
            System.out.println("user == null");
        }
    }
}
