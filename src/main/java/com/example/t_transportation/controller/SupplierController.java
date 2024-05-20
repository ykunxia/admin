package com.example.t_transportation.controller;
import com.example.t_transportation.entity.Material;
import com.example.t_transportation.entity.Suppliers;
import com.example.t_transportation.service.MaterialService;
import com.example.t_transportation.service.SuppliersService;
import com.example.t_transportation.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping( "/supplier")
public class SupplierController {
    @Autowired
        private SuppliersService suppliersService;


        @PostMapping("/add")
        public Result add(@RequestBody Suppliers suppliers) {
            suppliersService.add(suppliers);
            return Result.success();

        }


         @PostMapping("/delete")
        public Result delete(@RequestBody Suppliers suppliers) {
        suppliersService.delete(suppliers);
        return Result.success();
    }

        @PutMapping("/update")
        public Result update(@RequestBody Suppliers suppliers) {
        suppliersService.update(suppliers);
        return Result.success();

    }


    /*
    全部查询
     */
   @GetMapping("query")
    public Result<List<String>> query(Integer id) {
        List<String> pb = suppliersService.query(id);
        return Result.success(pb);


    }
}
