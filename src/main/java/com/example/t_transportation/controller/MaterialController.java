package com.example.t_transportation.controller;

import com.example.t_transportation.entity.CustomerInfo;
import com.example.t_transportation.entity.Material;
import com.example.t_transportation.service.MaterialService;
import com.example.t_transportation.util.PageBean;
import com.example.t_transportation.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping( "/material")
public class MaterialController {

        @Autowired
        private MaterialService materialService;


        @PostMapping("/add")
        public Result add(@RequestBody Material material) {
            materialService.add(material);
            return Result.success();

        }


         @PostMapping("/delete")
    public Result delete(@RequestBody Material material) {
        materialService.delete(material);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Material material) {
        materialService.update(material);
        return Result.success();

    }


    /*
    全部查询
     */
   @GetMapping("query")
    public Result<List<String>> query(Integer id) {
        List<String> pb = materialService.query(id);
        return Result.success(pb);


    }
}
