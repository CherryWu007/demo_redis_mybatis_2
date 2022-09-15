package com.atguigu.boot.mapper;

import com.atguigu.boot.entities.Customer;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 老贼
 * @version : 1.0
 * @Project : jucjvm
 * @Package : com.atguigu.boot.mapper
 * @ClassName : CustomerMapper.java
 * @createTime : 2022/9/14 19:14
 * @Email :851185679@qq.com
 * @Description :
 */

public interface CustomerMapper {

    int add(Customer customer);

    List<Customer> findAll();

    Customer getCustomerById(Integer id);

    Integer deleteById(Integer id);
}
