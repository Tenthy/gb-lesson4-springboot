package ru.kmetha.springbootapril.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kmetha.springbootapril.model.Product;
import ru.kmetha.springbootapril.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product findById(Integer id) {
        return productRepository.findById(id);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }
}
