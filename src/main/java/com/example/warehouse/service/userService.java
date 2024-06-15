package com.example.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.warehouse.entity.User;
import com.example.warehouse.utils.Rest;

import org.springframework.web.bind.annotation.RequestParam;

public interface userService extends IService<User> {






    Rest getUserinfo(Integer userId);

    Rest changeUserinfo(String userId, String changeItem, Object changeVariable);

    User getByName(String username);
}
