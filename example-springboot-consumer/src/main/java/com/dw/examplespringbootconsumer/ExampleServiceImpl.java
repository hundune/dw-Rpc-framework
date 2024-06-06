package com.dw.examplespringbootconsumer;

import com.dw.dwrpc.springboot.starter.annotation.RpcReference;
import com.dwpj.dwrpc.model.User;
import com.dwpj.dwrpc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @hundune~
 * @version1.0
 */
@Service
public class ExampleServiceImpl {

    @RpcReference
    private UserService userService;

    public void test() {
        User user = new User();
        user.setUserName("yupi");
        User resultUser = userService.getUser(user);
        System.out.println(resultUser.getUserName());
    }

}