package com.example.projetovendas.Category.services;

import com.example.projetovendas.Exceptions.ObjectNotFoundException;
import com.example.projetovendas.Category.models.Category;
import com.example.projetovendas.Category.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category findById(Long id) throws ObjectNotFoundException{
        Category category = categoryRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id
                + ", Tipo: " + Category.class.getName()));

        return category;
    }

    public List<Category> findAll() {

        return categoryRepository.findAll();
    }
}
