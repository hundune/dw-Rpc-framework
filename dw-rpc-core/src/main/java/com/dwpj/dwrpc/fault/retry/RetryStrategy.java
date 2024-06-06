package com.dwpj.dwrpc.fault.retry;

import com.dwpj.dwrpc.model.RpcResponse;

import java.util.concurrent.Callable;

/**
 * @hundune~
 * @version1.0
 * 重试策略
 */
public interface RetryStrategy {

    /**
     * 重试
     *
     * @param callable
     * @return
     * @throws Exception
     */
    RpcResponse doRetry(Callable<RpcResponse> callable) throws Exception;
}