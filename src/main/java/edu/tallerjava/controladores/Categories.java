package edu.tallerjava.controladores;

import edu.tallerjava.modelo.Category;

import java.util.ArrayList;
import java.util.List;

public class Categories {



    private List<Category> categories= new ArrayList<Category>();

    private static Categories categoriesUnico = new Categories();

    private Categories(){

        Category category1 = new Category();
        Category category2 = new Category();
        Category category3 = new Category();
        Category category4 = new Category();
        Category category5 = new Category();
        Category category6 = new Category();
        Category category7 = new Category();
        Category category8 = new Category();

        category1.setId(1L);
        category2.setId(2L);
        category8.setId(8L);
        category3.setId(0L);

        category1.setPermalink("http://home.mercadolibre.com.ar/vehiculos-accesorios/");
        category2.setPermalink("http://home.mercadolibre.com.ar/vehiculos-accesorios/");
        category3.setPermalink("http://home.mercadolibre.com.ar/vehiculos-accesorios/");
        category4.setPermalink("http://home.mercadolibre.com.ar/vehiculos-accesorios/");
        category5.setPermalink("http://home.mercadolibre.com.ar/vehiculos-accesorios/");
        category6.setPermalink("http://home.mercadolibre.com.ar/vehiculos-accesorios/");
        category7.setPermalink("http://home.mercadolibre.com.ar/vehiculos-accesorios/");
        category8.setPermalink("http://home.mercadolibre.com.ar/vehiculos-accesorios/");

        this.categories.add(category1);
        this.categories.add(category2);
        this.categories.add(category3);
        this.categories.add(category4);
        this.categories.add(category5);
        this.categories.add(category6);
        this.categories.add(category7);
        this.categories.add(category8);
    }

    public static Categories getInstance(){
        return categoriesUnico;
    }

    public List<Category> getCategories() {
        return categories;
    }
}
