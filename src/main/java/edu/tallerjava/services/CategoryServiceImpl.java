package edu.tallerjava.services;

import edu.tallerjava.modelo.Category;
import edu.tallerjava.repositorios.CategoryRepository;
import edu.tallerjava.repositorios.CategoryRepositoryImp;
import edu.tallerjava.repositorios.CategoryRepositoryML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepositoryMl;


   /* @Override
    public Category createCategory() {
        Category category=new Category();
        categoryRepository.save(category);
        return category;
    } */

    @Override
    public List<Category> findAll() {
        List<Category> categoryList;
        categoryList = categoryRepositoryMl.getAll();
        return categoryList;
    }

    @Override
    public Category getCategory(String id) {
        Category category = categoryRepositoryMl.getCategory(id);
        return category;
    }

}
