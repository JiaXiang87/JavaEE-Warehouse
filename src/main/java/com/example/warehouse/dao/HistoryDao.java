package com.example.warehouse.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.warehouse.entity.History;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface HistoryDao extends BaseMapper<History> {
}
