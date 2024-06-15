package com.example.warehouse.service.Imp;

import com.example.warehouse.dao.CategoryDao;
import com.example.warehouse.entity.Category;
import com.example.warehouse.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getAllCategories() {
        return categoryDao.selectList(null);
    }


}
