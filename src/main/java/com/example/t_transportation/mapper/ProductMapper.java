package com.example.t_transportation.mapper;

import com.example.t_transportation.entity.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Insert("insert into product(product_name,quantity,material)" +
            "values(#{productName},#{quantity},#{material})")
    void add(Product product);


    @Delete("delete from product where id=#{id} and product_name=#{productName}")
    void delete(Product product);

    void update(Product product);

    List<String> query(Integer id);
}
