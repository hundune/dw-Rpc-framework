package com.dwpj.dwrpc.fault.tolerant;

import com.dwpj.dwrpc.model.RpcResponse;
import java.util.Map;
/**
 * @hundune~
 * @version1.0
 * 容错策略
 */
public interface TolerantStrategy {

    /**
     * 容错
     *
     * @param context 上下文，用于传递数据
     * @param e       异常
     * @return
     */
    RpcResponse doTolerant(Map<String, Object> context, Exception e);
}