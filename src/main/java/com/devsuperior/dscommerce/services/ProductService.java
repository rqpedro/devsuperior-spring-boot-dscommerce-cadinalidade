package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        // Essa é uma opção de fazer o DTO pelo constutor de ProductDTO
//        ProductDTO dto = new ProductDTO(product.getId(),
//                product.getName(),
//                product.getDescription(),
//                product.getPrice(),
//                product.getImgUrl());

        // Essa é a opção de "manipular" o construtor do ProductDTO direto da entidade Product
        ProductDTO dto = new ProductDTO(product);
        return dto;

        // Outra forma de fazer o código acima
//        Product product = repository.findById(id).get();
//        return new ProductDTO(product);
    }
}
