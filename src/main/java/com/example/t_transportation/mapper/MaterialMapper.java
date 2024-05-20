package com.example.t_transportation.mapper;

import com.example.t_transportation.entity.CustomerInfo;
import com.example.t_transportation.entity.Material;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MaterialMapper {

    List<String> query(Integer id);

    @Insert("insert into materials(materials_name,quantity,suppliers_name)" +
            "values(#{materialsName},#{quantity},#{suppliersName})")
    void add(Material material);


    @Delete("delete from materials where id=#{id}")
    void delete(Material material);


    void update(Material material);
}
