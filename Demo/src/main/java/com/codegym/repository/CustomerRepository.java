package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CustomerRepository extends JpaRepository<Customer, Long> {
    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public List<Customer> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<Customer> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public <S extends Customer> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void flush() {

    }
}
