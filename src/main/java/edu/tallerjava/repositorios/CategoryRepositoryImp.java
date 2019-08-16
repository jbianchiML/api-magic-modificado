package edu.tallerjava.repositorios;

import edu.tallerjava.modelo.Category;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CategoryRepositoryImp implements CategoryRepositoryML{

    private RestTemplate restTemplate = new RestTemplate();
    private String url = "https://api.mercadolibre.com/sites/MLA/categories";

    @Override
    public List<Category> getAll() {
        final List results = restTemplate.getForObject(url + "/", List.class);
        return results;
    }

    @Override
    public Category getCategory(String id) {
        return null;
    }

}
