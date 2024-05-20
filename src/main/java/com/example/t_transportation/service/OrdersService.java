package com.example.t_transportation.service;

import com.example.t_transportation.entity.Orders;

import java.util.List;

public interface OrdersService {
    void add(Orders orders);

    void delete(Orders orders);

    void update(Orders orders);

    List<String> query(Integer id);
}
