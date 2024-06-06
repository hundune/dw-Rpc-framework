package com.dwpj.dwrpc.fault.tolerant;

import com.dwpj.dwrpc.model.RpcResponse;

import java.util.Map;

/**
 * @hundune~
 * @version1.0
 * 快速失败 - 容错策略（立刻通知外层调用方）
 */
public class FailFastTolerantStrategy implements TolerantStrategy {

    @Override
    public RpcResponse doTolerant(Map<String, Object> context, Exception e) {
        throw new RuntimeException("服务报错", e);
    }
}