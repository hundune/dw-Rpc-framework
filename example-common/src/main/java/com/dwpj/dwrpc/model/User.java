package com.dwpj.dwrpc.model;

import java.io.Serializable;

/**
 * @hundune~
 * @version1.0
 */
public class User implements Serializable {
    private String userName ;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
