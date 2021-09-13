package com.example.projetovendas.Category.controllers;

import com.example.projetovendas.Category.models.Category;
import com.example.projetovendas.Category.services.CategoryService;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @NotFound(action = NotFoundAction.IGNORE)
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Category category = categoryService.findById(id);

        return ResponseEntity.ok().body(category);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll(){

        List<Category> categories = categoryService.findAll();

        return ResponseEntity.ok().body(categories);
    }
}
