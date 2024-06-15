package com.example.warehouse.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 该实体类对应数据库中的数据货物类型表
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("category")
public class Category {

    //货物类型ID
    Integer categoryId;
    //货物类型名称
    String categoryName;
}
