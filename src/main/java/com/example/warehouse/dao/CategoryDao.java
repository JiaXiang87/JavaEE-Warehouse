package com.example.warehouse.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.warehouse.entity.Category;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CategoryDao extends BaseMapper<Category> {
}
