package edu.tallerjava.services;

import edu.tallerjava.modelo.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

    //Category createCategory();

    List<Category> findAll();

    Category getCategory(String id);

}
