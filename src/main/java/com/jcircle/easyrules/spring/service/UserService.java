package com.jcircle.easyrules.spring.service;



import com.jcircle.easyrules.spring.model.User;


import java.util.List;


public interface UserService {

    public List<User> getCustomerList();
    public User getCustomerInfo(String customerId);



}
