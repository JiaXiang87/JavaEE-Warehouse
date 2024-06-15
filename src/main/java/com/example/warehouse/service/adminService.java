package com.example.warehouse.service;

import com.example.warehouse.utils.Rest;
/**
 * 该Service接口对应adminController
 * */
public interface adminService {
    public Rest fgetListofWH();

    public Rest fgetWHinfo(String WHId);

    public Rest fchangeWH(String WHId, String item, String variable);

    public Rest fdeleteWH(String WHId);

    public Rest faddWH(String type, String maxContext, String nowContext);
}
