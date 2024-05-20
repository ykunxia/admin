package com.example.t_transportation.mapper;


import com.example.t_transportation.entity.CustomerInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomersMapper {
    @Insert("insert into customers(customers_name,contact,email)" +
            "values(#{customersName},#{contact},#{email})")
    void add(CustomerInfo customerInfo);

    @Delete("delete from customers where id=#{id}")
    void delete(CustomerInfo customerInfo);

    void update(CustomerInfo customerInfo);

    List<String> query(Integer id);

    List<CustomerInfo> list(Integer id, String customersName);
}
