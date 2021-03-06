package com.pike96.ammozone.service;
import com.pike96.ammozone.util.Page;
import com.pike96.ammozone.pojo.Category;
import java.util.List;

public interface CategoryService{
    List<Category> list(int start);

    void add(Category category);
    void update(Category category);
    Category get(int id);
    void delete(int id);
}
