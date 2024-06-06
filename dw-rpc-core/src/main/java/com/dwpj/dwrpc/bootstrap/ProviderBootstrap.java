package com.dwpj.dwrpc.bootstrap;

import com.dwpj.dwrpc.RpcApplication;
import com.dwpj.dwrpc.config.RegistryConfig;
import com.dwpj.dwrpc.config.RpcConfig;
import com.dwpj.dwrpc.model.ServiceMetaInfo;
import com.dwpj.dwrpc.model.ServiceRegisterInfo;
import com.dwpj.dwrpc.registry.LoacalRegistry;
import com.dwpj.dwrpc.registry.Registry;
import com.dwpj.dwrpc.registry.RegistryFactory;
import com.dwpj.dwrpc.server.tcp.VertxTcpServer;

import java.util.List;

/**
 * @hundune~
 * @version1.0
 * 服务提供者初始化
 */
public class ProviderBootstrap {

    /**
     * 初始化
     */
    public static void init(List<ServiceRegisterInfo> serviceRegisterInfoList) {
        // RPC 框架初始化（配置和注册中心）
        RpcApplication.init();
        // 全局配置
        final RpcConfig rpcConfig = RpcApplication.getRpcConfig();

        // 注册服务
        for (ServiceRegisterInfo<?> serviceRegisterInfo : serviceRegisterInfoList) {
            String serviceName = serviceRegisterInfo.getServiceName();
            // 本地注册
            LoacalRegistry.register(serviceName, serviceRegisterInfo.getImplClass());

            // 注册服务到注册中心
            RegistryConfig registryConfig = rpcConfig.getRegistryConfig();
            Registry registry = RegistryFactory.getInstance(registryConfig.getRegistry());
            ServiceMetaInfo serviceMetaInfo = new ServiceMetaInfo();
            serviceMetaInfo.setServiceName(serviceName);
            serviceMetaInfo.setServiceHost(rpcConfig.getServerHost());
            serviceMetaInfo.setServicePort(rpcConfig.getServerPort());
            try {
                registry.register(serviceMetaInfo);
            } catch (Exception e) {
                throw new RuntimeException(serviceName + " 服务注册失败", e);
            }
        }

        // 启动服务器
        VertxTcpServer vertxTcpServer = new VertxTcpServer();
        vertxTcpServer.doStart(rpcConfig.getServerPort());
    }
}