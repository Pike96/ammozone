package com.pike96.ammozone.service.impl;
import com.pike96.ammozone.mapper.CategoryMapper;
import com.pike96.ammozone.pojo.Category;
import com.pike96.ammozone.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> list() {
        return categoryMapper.list();
    };

}