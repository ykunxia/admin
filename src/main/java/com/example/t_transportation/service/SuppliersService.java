package com.example.t_transportation.service;

import com.example.t_transportation.entity.Suppliers;

import java.util.List;

public interface SuppliersService {
    void add(Suppliers suppliers);

    void delete(Suppliers suppliers);

    void update(Suppliers suppliers);

    List<String> query(Integer id);
}
