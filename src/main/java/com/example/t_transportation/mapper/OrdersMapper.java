package com.example.t_transportation.mapper;


import com.example.t_transportation.entity.Orders;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersMapper {

    @Insert("insert into orders(customers_name,product_name,order_amount,order_date,total_price)" +
            "values(#{customersName},#{productName},#{orderAmount},#{orderDate},#{totalPrice})")
    void add(Orders orders);


    @Delete("delete from orders where id=#{id}")
    void delete(Orders orders);

    void update(Orders orders);

    List<String> query(Integer id);
}
