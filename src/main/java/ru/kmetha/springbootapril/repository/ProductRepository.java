package ru.kmetha.springbootapril.repository;

import org.springframework.stereotype.Component;
import ru.kmetha.springbootapril.model.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    List<Product> repository = new ArrayList<>();

    private int countProducts = 0;

    public Product save(Product product) {
        product.setId(countProducts++);
        repository.add(product);
        return new Product(product.getId(), product.getTitle(), product.getPrice());
    }

    public Product findById(Integer id) {
        return repository.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Product> findAll() {
        return new ArrayList<>(repository);
    }

    public void deleteById(Integer id) {
        repository.removeIf(product -> product.getId().equals(id));
    }
}
