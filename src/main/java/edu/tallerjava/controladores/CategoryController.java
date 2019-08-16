package edu.tallerjava.controladores;


import edu.tallerjava.modelo.Category;
import edu.tallerjava.repositorios.CategoryRepository;
import edu.tallerjava.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping(path = "/categories")
    public ResponseEntity<List<Category>>  getlist(){
        //final List<Category> categories = Categories.getInstance().getCategories();
        final List<Category> categories=categoryService.findAll();
        return new ResponseEntity(categories, HttpStatus.OK);
    }

    @GetMapping(path = "/categories/{id}")
    public ResponseEntity<Category> getCategory( @PathVariable String id){
        Category category = categoryService.getCategory(Long.valueOf(id));
        if(category != null)
            return new ResponseEntity(category, HttpStatus.OK);
        else{
            return  new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping (path ="/categories")
    public ResponseEntity<Category> createCategory (){
        Category category= categoryService.createCategory();
        return new ResponseEntity(category,HttpStatus.OK);
    }
}
