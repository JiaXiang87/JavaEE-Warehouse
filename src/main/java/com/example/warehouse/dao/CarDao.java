package com.example.warehouse.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.warehouse.entity.Car;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CarDao extends BaseMapper<Car> {
}
