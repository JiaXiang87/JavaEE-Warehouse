package com.example.warehouse.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.warehouse.entity.location;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface locationDao extends BaseMapper<location> {
}
