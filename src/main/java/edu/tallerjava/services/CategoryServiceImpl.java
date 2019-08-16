package edu.tallerjava.services;

import edu.tallerjava.modelo.Category;
import edu.tallerjava.repositorios.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;



    @Override
    public Category createCategory() {
        Category category=new Category();
        categoryRepository.save(category);
        return category;
    }

    @Override
    public List<Category> findAll() {
        List<Category> categoryList;
        categoryList = categoryRepository.findAll();
        return categoryList;
    }

    @Override
    public Category getCategory(Long id) {
        Category category;
        Optional opt = categoryRepository.findById(id);
        if(opt.isEmpty()){
            return category = null;
        }
        category = (Category) opt.get();
        return category;
    }

}
