package com.example.projetovendas;

import com.example.projetovendas.Category.models.Category;
import com.example.projetovendas.Category.repositories.CategoryRepository;
import com.example.projetovendas.Product.models.Product;
import com.example.projetovendas.Product.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProjetoVendasApplication implements CommandLineRunner {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjetoVendasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        /*Category category1 = new Category(null, "Informática");
        Category category2 = new Category(null, "Escritório");

        Product product1 = new Product(null, "Computador", 2000.00);
        Product product2 = new Product(null, "Impressora", 800.00);
        Product product3 = new Product(null, "Mouse", 90.00);

        category1.getProducts().addAll(Arrays.asList(product1, product2, product3));
        category2.getProducts().addAll(Arrays.asList(product2));

        product1.getCategories().addAll(Arrays.asList(category1));
        product2.getCategories().addAll(Arrays.asList(category1, category2));
        product3.getCategories().addAll(Arrays.asList(category1));

        categoryRepository.saveAll(Arrays.asList(category1, category2));
        productRepository.saveAll(Arrays.asList(product1, product2, product3));*/
    }

}
