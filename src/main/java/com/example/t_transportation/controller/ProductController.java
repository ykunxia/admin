package com.example.t_transportation.controller;
import com.example.t_transportation.entity.Product;
import com.example.t_transportation.service.ProductService;
import com.example.t_transportation.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/product")
public class ProductController {
        @Autowired
        private ProductService productService;


        @PostMapping("/add")
        public Result add(@RequestBody Product product) {
            productService.add(product);
            return Result.success();

        }


         @PostMapping("/delete")
    public Result delete(@RequestBody Product product) {
        productService.delete(product);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Product product) {
        productService.update(product);
        return Result.success();

    }


    /*
    全部查询
     */
   @GetMapping("query")
    public Result<List<String>> query(Integer id) {
        List<String> pb = productService.query(id);
        return Result.success(pb);


    }
}
