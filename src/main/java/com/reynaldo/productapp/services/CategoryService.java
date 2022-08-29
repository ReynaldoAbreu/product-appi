package com.reynaldo.productapp.services;

import com.reynaldo.productapp.domain.Category;
import com.reynaldo.productapp.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Optional<Category> find(Integer id){

        return categoryRepository.findById(id);
    }

}
