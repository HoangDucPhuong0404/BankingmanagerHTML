package com.codegym.service;

import java.util.List;

public interface IGeneralService <T>{
    List<T> findAll();
    T getbyId(Long id);
    T create(T t);
    T update(T t);
    void remove(Long id);

}
