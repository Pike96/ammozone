package com.pike96.ammozone.service;
import com.pike96.ammozone.util.Page;
import com.pike96.ammozone.pojo.Category;
import java.util.List;

public interface CategoryService{
    List<Category> list(Page page);

    int total();

    void add(Category category);
}
