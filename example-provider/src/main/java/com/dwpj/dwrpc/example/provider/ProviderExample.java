package com.dwpj.dwrpc.example.provider;

import com.dwpj.dwrpc.bootstrap.ProviderBootstrap;
import com.dwpj.dwrpc.model.ServiceRegisterInfo;
import com.dwpj.dwrpc.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @hundune~
 * @version1.0
 */
public class ProviderExample {

    public static void main(String[] args) {
        // 要注册的服务
        List<ServiceRegisterInfo> serviceRegisterInfoList = new ArrayList<>();
        ServiceRegisterInfo serviceRegisterInfo = new ServiceRegisterInfo(UserService.class.getName(), UserServiceImpl.class);
        serviceRegisterInfoList.add(serviceRegisterInfo);

        // 服务提供者初始化
        ProviderBootstrap.init(serviceRegisterInfoList);
    }
}