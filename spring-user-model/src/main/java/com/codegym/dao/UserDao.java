package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<User>();
        User us = new User();
        us.setAge(10);
        us.setName("John");
        us.setAccount("john");
        us.setEmail("john@codegym.vn");
        us.setPassword("123456");
        users.add(us);

        User us2 = new User();
        us2.setAge(15);
        us2.setName("Bill");
        us2.setAccount("bill");
        us2.setEmail("bill@codegym.vn");
        us2.setPassword("123456");
        users.add(us2);

        User us3 = new User();
        us3.setAge(16);
        us3.setName("Mike");
        us3.setAccount("mike");
        us3.setEmail("mike@codegym.vn");
        us3.setPassword("123456");
        users.add(us3);
    }
    public static User checkLogin(Login login){
        for (User u: users){
            if (u.getAccount().equals(login.getAccount())&& u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
