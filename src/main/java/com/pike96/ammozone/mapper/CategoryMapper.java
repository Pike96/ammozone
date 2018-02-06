package com.pike96.ammozone.mapper;
import com.pike96.ammozone.util.Page;
import com.pike96.ammozone.pojo.Category;
import java.util.List;

public interface CategoryMapper {
    public List<Category> list(Page page);

    public int total();
}