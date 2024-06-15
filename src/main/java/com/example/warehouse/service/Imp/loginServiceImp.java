package com.example.warehouse.service.Imp;

import com.example.warehouse.service.loginService;
import com.example.warehouse.utils.Code;
import com.example.warehouse.utils.Rest;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImp implements loginService {
    /**
     * Param:userId:用户id; passWord:用户密码
     * return: Rest类型对象，包含状态码与登录结果
     * */
    public Rest fchecklogin(String userId, String passWord){
        return new Rest(Code.rc200.getCode(), "登录成功");
    }
    /**
     * Param:userName:用户注册时使用的名字； passWord:用户设置的密码; userRole:用户的身份（个人，公司）
     * return:Rest类型对象，包含状态码和注册结果
     * */
    public Rest fregister(String userName, String passWord, String userRole){
        return new Rest(Code.rc200.getCode(), "注册成功");
    }
}
