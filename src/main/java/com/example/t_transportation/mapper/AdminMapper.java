package com.example.t_transportation.mapper;

import com.example.t_transportation.entity.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper



public interface AdminMapper {
    @Select("select * from admin where zhanghao=#{zhanghao}")
     Admin findAdmin(String zhanghao);

    @Insert("insert into admin(zhanghao,mima,addtime)"+
    "values(#{zhanghao},#{mima},getdate())")
    void  add(String zhanghao, String mima);
}
