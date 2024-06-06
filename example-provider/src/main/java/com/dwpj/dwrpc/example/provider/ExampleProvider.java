package com.dwpj.dwrpc.example.provider;

import com.dwpj.dwrpc.registry.LoacalRegistry;
import com.dwpj.dwrpc.service.UserService;
import com.dwpj.dwrpc.server.HttpServer;
import com.dwpj.dwrpc.server.VertxHttpServer;

/**
 * @hundune~
 * @version1.0
 */
public class ExampleProvider {
    public static void main(String[] args) {
        // 注册服务
        LoacalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
