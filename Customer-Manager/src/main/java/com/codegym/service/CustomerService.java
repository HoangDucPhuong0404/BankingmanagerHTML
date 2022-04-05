package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements CustomerServiceImpl{
    private static SessionFactory sessionFactory;


    @Override
    public List<Customer> findAll() {
        String queryStr = "SELECT c FROM Customer AS c";
        TypedQuery<Customer> query = entityManager.crea
    }
}
