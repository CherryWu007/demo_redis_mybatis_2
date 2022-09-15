package com.atguigu.boot.controller;

import com.atguigu.boot.entities.Customer;
import com.atguigu.boot.service.CustomerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 老贼
 * @version : 1.0
 * @Project : jucjvm
 * @Package : com.atguigu.boot.controller
 * @ClassName : CustomerController.java
 * @createTime : 2022/9/14 19:12
 * @Email :851185679@qq.com
 * @Description :
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    private CustomerService customerService;
    @ApiOperation("新增客户")
    @PostMapping("/add")
    public int add(Customer customer){
        return customerService.addCustomer(customer);
    }
    @ApiOperation("查询所有客户")
    @GetMapping("/findAll")
    public List<Customer> findAll(){
        return customerService.findAll();
    }
    @ApiOperation("根据id查询客户")
    @GetMapping("/get/{id}")
    public Customer getCustomerById(@PathVariable("id") Integer id){
        return customerService.getCustomerById(id);
    }
    @ApiOperation("根据id删除用户信息")
    @DeleteMapping("/delete/{id}")
    public Integer deleteById(@PathVariable("id") Integer id){
        return customerService.deleteById(id);
    }
}
