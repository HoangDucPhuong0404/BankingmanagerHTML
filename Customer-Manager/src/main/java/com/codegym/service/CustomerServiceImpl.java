package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public interface CustomerServiceImpl {
    List<Customer> customers = new ArrayList<>();

    public List<Customer> findAll(){
        return customers;
    }
}
