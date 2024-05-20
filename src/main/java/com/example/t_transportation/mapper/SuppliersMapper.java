package com.example.t_transportation.mapper;


import com.example.t_transportation.entity.Suppliers;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SuppliersMapper {
    @Insert("insert into suppliers(suppliers_name,materials_name,materials_totalprice,contact,email)" +
            "values(#{suppliersName},#{materialsName},#{materialsTotalPrice},#{contact},#{email})")
    void add(Suppliers suppliers);

     @Delete("delete from suppliers where id=#{id} and suppliers_name=#{suppliersName}")
    void delete(Suppliers suppliers);

    void update(Suppliers suppliers);

    List<String> query(Integer id);
}
