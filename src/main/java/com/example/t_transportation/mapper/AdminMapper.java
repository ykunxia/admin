package com.example.t_transportation.mapper;

import com.example.t_transportation.entity.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper

public interface AdminMapper {
    @Select("select * from admin where zhanghao=#{zhanghao}")
     Admin findAdmin(String zhanghao);

    @Insert("insert into admin(zhanghao,mima,addtime)"+
    "values(#{zhanghao},#{mima},getDate())")
    void  add(String zhanghao, String mima);

    @Update("update admin set user_pic=#{avatarUrl} where id=#{id}")
    void updateAvatar(String avatarUrl,Integer id);

     @Update("update admin set mima=#{mima},addtime=#{addTime} where id=#{id}")
    void update(Admin admin);
}
