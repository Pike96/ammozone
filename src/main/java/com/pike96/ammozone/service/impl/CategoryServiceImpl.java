package com.pike96.ammozone.service.impl;
import com.pike96.ammozone.util.Page;
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

    @Override
    public List<Category> list(Page page) {
        return categoryMapper.list(page);
    }

    @Override
    public int total() {
        return categoryMapper.total();
    }

    @Override
    public void add(Category category) {
        categoryMapper.add(category);
    }
    @Override
    public void delete(int id) {
        categoryMapper.delete(id);
    }
}