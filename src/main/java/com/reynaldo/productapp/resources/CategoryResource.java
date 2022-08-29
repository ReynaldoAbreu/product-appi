package com.reynaldo.productapp.resources;

import com.reynaldo.productapp.domain.Category;
import com.reynaldo.productapp.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Optional<Category> optionalCategory = categoryService.find(id);
        return ResponseEntity.ok().body(optionalCategory);


//        Category cat1 = new Category(1, "Computing");
//        Category cat2 = new Category(2, "services");
//
//        List<Category> list = new ArrayList<>();
//        list.add(cat1);
//        list.add(cat2);
//
//        return list;
    }

}
