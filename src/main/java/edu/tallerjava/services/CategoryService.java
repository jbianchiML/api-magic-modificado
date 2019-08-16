package edu.tallerjava.services;

import edu.tallerjava.modelo.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory();

    List<Category> findAll();

    Category getCategory(Long id);

}
