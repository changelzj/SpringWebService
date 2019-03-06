package com.example.webservice;


import com.example.entity.User;

import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "UserWebService")
public interface UserWebService {
    @WebResult(name = "getUserById")
    User getUserById(Integer id);

    @WebResult(name = "getList")
    List<User> getList(User user);
}
