package edu.tallerjava.repositorios;

import edu.tallerjava.modelo.Category;

import java.util.List;

public interface CategoryRepositoryML{

    List<Category> getAll();

    Category getCategory(String id);

}
