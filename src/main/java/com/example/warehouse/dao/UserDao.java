package com.example.warehouse.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.warehouse.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User>{
}
