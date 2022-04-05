package com.codegym.controller;

import com.codegym.model.Customer;

import com.codegym.sevice.CustomerService;
import com.codegym.sevice.CustomerServiceFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/home", method = RequestMethod.GET)
public class CustomerController {
    private CustomerService customerService = CustomerServiceFactory.getInstance();
     public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
//    public ModelAndView showForminfo(){
//
//          ModelAndView modelAndView = new ModelAndView("info.jsp");
//
//    }

}
