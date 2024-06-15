package com.example.warehouse.service.Imp;

import com.example.warehouse.dao.CarDao;
import com.example.warehouse.entity.Car;
import com.example.warehouse.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao carDao;
    @Override
    public List<Car> getAllCars() {
        return carDao.selectList(null); // 获取所有车辆信息
    }

}
