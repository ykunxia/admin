package com.example.t_transportation.service.Impl;

import com.example.t_transportation.entity.CustomerInfo;
import com.example.t_transportation.entity.Material;
import com.example.t_transportation.mapper.MaterialMapper;
import com.example.t_transportation.service.MaterialService;
import com.example.t_transportation.util.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialMapper materialMapper;


    @Override
    public void add(Material material) {
        materialMapper.add(material);
    }

    @Override
    public void delete(Material material) {
        materialMapper.delete(material);
    }

    @Override
    public void update(Material material) {
        materialMapper.update(material);
    }


    @Override
    public List<String> query(Integer id) {
        return materialMapper.query(id);
    }
}
