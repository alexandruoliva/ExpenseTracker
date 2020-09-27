package com.demo.expensetracker.controller;


import com.demo.expensetracker.model.Category;
import com.demo.expensetracker.repository.CategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

/**
 * Created by oli on 27.09.2020.
 */
@RestController
@RequestMapping("/api")
public class CategoryController {

    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        super();
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/categories")
    Collection<Category> categories() {
        return categoryRepository.findAll();
    }

    //category/2
    @GetMapping("/category/{id}")
    ResponseEntity<?> getCategory(@PathVariable Long id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @PostMapping("/category")
    ResponseEntity<Category> createCategory(@Validated @RequestBody Category category) throws URISyntaxException{
        Category result= categoryRepository.save(category);
        return ResponseEntity.created(new URI("/api/category" + result.getId())).body(result);

    }


}

