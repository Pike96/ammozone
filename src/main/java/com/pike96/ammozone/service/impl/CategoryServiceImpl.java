package com.pike96.ammozone.service.impl;
import com.pike96.ammozone.util.Page;
import com.pike96.ammozone.mapper.CategoryMapper;
import com.pike96.ammozone.pojo.Category;
import com.pike96.ammozone.pojo.CategoryExample;
import com.pike96.ammozone.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public void add(Category category) {
        categoryMapper.insert(category);
    }
    @Override
    public void update(Category category) {
        categoryMapper.updateByPrimaryKeySelective(category);
    }
    @Override
    public Category get(int id) {
        return categoryMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<Category> list() {
        CategoryExample example =new CategoryExample();
        example.setOrderByClause("id desc");
        return categoryMapper.selectByExample(example);
    }
    @Override
    public void delete(int id) {
        categoryMapper.deleteByPrimaryKey(id);
    }
}