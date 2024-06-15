package com.example.warehouse.service;

import com.example.warehouse.utils.Rest;

import java.util.Date;

public interface ordersService {

    public Rest addOrder(String itemName, Double numOfItem, String type, Integer userId, Date startTime, Date endTime);



    void autoAddOrder(Integer cargoId);
}
