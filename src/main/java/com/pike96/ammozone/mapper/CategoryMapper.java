package com.pike96.ammozone.mapper;
import com.pike96.ammozone.util.Page;
import com.pike96.ammozone.pojo.Category;
import java.util.List;

public interface CategoryMapper {
    List<Category> list(Page page);

    int total();

    void add(Category category);
    void delete(int id);
}