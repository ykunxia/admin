package com.example.t_transportation.service.Impl;

import com.example.t_transportation.entity.Orders;
import com.example.t_transportation.mapper.MaterialMapper;
import com.example.t_transportation.mapper.OrdersMapper;
import com.example.t_transportation.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public void add(Orders orders) {
        ordersMapper.add(orders);
    }

    @Override
    public void delete(Orders orders) {
        ordersMapper.delete(orders);
    }

    @Override
    public void update(Orders orders) {
        ordersMapper.update(orders);
    }

    @Override
    public List<String> query(Integer id) {
        return ordersMapper.query(id);
    }
}
