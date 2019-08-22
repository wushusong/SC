package com.mywork.sc.service.impl;

import com.mywork.sc.entity.Category;
import com.mywork.sc.mapper.CategoryMapper;
import com.mywork.sc.service.IIndexCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexCategoryService implements IIndexCategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    public CategoryMapper getCategoryMapper() {
        return categoryMapper;
    }

    public void setCategoryMapper(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<Category> showCategoryAll() {

        List<Category> categoryAll = categoryMapper.getCategoryAll();

        return categoryAll;
    }
}
