package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService extends IGeneralService<Customer> {
    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer getbyId(Long id) {
        return null;
    }

    @Override
    public Customer create(Customer customer) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
