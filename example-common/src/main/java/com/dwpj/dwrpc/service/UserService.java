package com.dwpj.dwrpc.service;

import com.dwpj.dwrpc.model.User;

/**
 * @hundune~
 * @version1.0
 */
public interface UserService {
    User getUser(User user);
    /**
     * 新方法 - 获取数字
     */
    default short getNumber() {
        return 1;
    }
}
