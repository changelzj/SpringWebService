package com.example.webservice;

import com.example.entity.User;

import java.util.List;


public class UserWebServiceImpl implements UserWebService {
    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setUsername("sunqian");
        user.setName("才女");
        user.setAge(22);
        return user;
    }

    @Override
    public List<User> getList(User user) {
        return null;
    }


}
