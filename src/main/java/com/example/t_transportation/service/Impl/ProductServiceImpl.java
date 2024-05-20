package com.example.t_transportation.service.Impl;

import com.example.t_transportation.entity.Product;
import com.example.t_transportation.mapper.ProductMapper;
import com.example.t_transportation.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public void add(Product product) {
        productMapper.add(product);
    }

    @Override
    public void delete(Product product) {
        productMapper.delete(product);
    }

    @Override
    public void update(Product product) {
        productMapper.update(product);
    }

    @Override
    public List<String> query(Integer id) {
        return productMapper.query(id);
    }
}
