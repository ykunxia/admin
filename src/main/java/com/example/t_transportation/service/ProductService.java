package com.example.t_transportation.service;

import com.example.t_transportation.entity.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);

    void delete(Product product);

    void update(Product product);

    List<String> query(Integer id);
}
