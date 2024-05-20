package com.example.t_transportation.service.Impl;


import com.example.t_transportation.entity.Suppliers;
import com.example.t_transportation.mapper.SuppliersMapper;
import com.example.t_transportation.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuppliersServiceImpl implements SuppliersService {

    @Autowired
    private SuppliersMapper suppliersMapper;

    @Override
    public void add(Suppliers suppliers) {
        suppliersMapper.add(suppliers);

    }

    @Override
    public void delete(Suppliers suppliers) {
        suppliersMapper.delete(suppliers);
    }

    @Override
    public void update(Suppliers suppliers) {
        suppliersMapper.update(suppliers);
    }

    @Override
    public List<String> query(Integer id) {
        return suppliersMapper.query(id);
    }
}
