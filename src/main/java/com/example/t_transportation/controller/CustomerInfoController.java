package com.example.t_transportation.controller;


import com.example.t_transportation.entity.CustomerInfo;
import com.example.t_transportation.service.CustomerInfoService;
import com.example.t_transportation.util.PageBean;
import com.example.t_transportation.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping( "/customer")
public class CustomerInfoController {

    @Autowired
    private CustomerInfoService customerInfoService;


    @PostMapping("/add")
    public Result add(@RequestBody CustomerInfo customerInfo) {
        customerInfoService.add(customerInfo);
        return Result.success();

    }

    @PostMapping("/delete")
    public Result delete(@RequestBody CustomerInfo customerInfo) {
        customerInfoService.delete(customerInfo);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody CustomerInfo customerInfo) {
        customerInfoService.update(customerInfo);
        return Result.success();

    }


    /*
    条件分页列表查询
   pageNum-当前页码，pageSize-每页条数
    */
    @GetMapping("list")
  public Result<PageBean<CustomerInfo>> list(@RequestParam(required = false) Integer pageNum,@RequestParam(required = false)Integer pageSize, Integer id, String customersName){
        PageBean<CustomerInfo> pb=customerInfoService.list(pageNum,pageSize,id,customersName);
        return Result.success(pb);
    }

    /*
    全部查询
     */
   @GetMapping("query")
    public Result<List<String>> query(Integer id) {
        List<String> pb = customerInfoService.query(id);
        return Result.success(pb);


    }
}
