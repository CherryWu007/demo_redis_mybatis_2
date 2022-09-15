package com.atguigu.boot.service;

import com.atguigu.boot.entities.Customer;
import com.atguigu.boot.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 老贼
 * @version : 1.0
 * @Project : jucjvm
 * @Package : com.atguigu.boot.service
 * @ClassName : CustomerService.java
 * @createTime : 2022/9/14 19:13
 * @Email :851185679@qq.com
 * @Description :
 */
@Service
public class CustomerService {
    @Resource
    private CustomerMapper customerMapper;

    public int addCustomer(Customer customer) {
        return customerMapper.add(customer);

    }

    public List<Customer> findAll() {
         return customerMapper.findAll();
    }

    public Customer getCustomerById(Integer id) {
        return customerMapper.getCustomerById(id);
    }

    public Integer deleteById(Integer id) {
        return customerMapper.deleteById(id);
    }
}
