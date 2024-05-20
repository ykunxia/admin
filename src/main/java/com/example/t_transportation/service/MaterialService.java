package com.example.t_transportation.service;

import com.example.t_transportation.entity.Material;
import com.example.t_transportation.util.PageBean;

import java.util.List;

public interface MaterialService {
    void add(Material material);

    void delete(Material material);

    void update(Material material);

    List<String> query(Integer id);
}
