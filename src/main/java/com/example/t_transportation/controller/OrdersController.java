package com.example.t_transportation.controller;


import com.example.t_transportation.entity.Material;
import com.example.t_transportation.entity.Orders;
import com.example.t_transportation.service.MaterialService;
import com.example.t_transportation.service.OrdersService;
import com.example.t_transportation.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/orders")
public class OrdersController {
    @Autowired
        private OrdersService ordersService;


        @PostMapping("/add")
        public Result add(@RequestBody Orders orders) {
            ordersService.add(orders);
            return Result.success();

        }


         @PostMapping("/delete")
    public Result delete(@RequestBody Orders orders) {
        ordersService.delete(orders);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Orders orders) {
        ordersService.update(orders);
        return Result.success();

    }


    /*
    全部查询
     */
   @GetMapping("query")
    public Result<List<String>> query(Integer id) {
        List<String> pb = ordersService.query(id);
        return Result.success(pb);


    }
}
