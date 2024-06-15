package com.example.warehouse.service;

import com.example.warehouse.utils.Rest;

/**
 * 该service对应logincontroller
 * */
public interface loginService {
    public Rest fchecklogin(String userId, String passWord);

    public Rest fregister(String userName, String passWord, String userRole);
}
