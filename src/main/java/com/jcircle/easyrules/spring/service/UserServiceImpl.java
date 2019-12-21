package com.jcircle.easyrules.spring.service;


import com.jcircle.easyrules.spring.model.User;

import com.jcircle.easyrules.spring.util.RestUtilFactory;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    RestUtilFactory restUtilFactory;

    @Override
    public List<User> getCustomerList() {
        List<User> userList = new ArrayList<User>();
        User user = new User();
        user.setUserId("1");
        user.setUserAddress("34 Cross Street wels IL");
        user.setUserName("David Nicole");
        user.setPremiumUser(true);
        userList.add(user);
        user = new User();

        user.setUserId("2");
        user.setUserAddress("34 Frank St Dons, CA");
        user.setUserName("Mark Pike");
        user.setPremiumUser(true);
        userList.add(user);

        return userList;
    }

    @Override
    public User getCustomerInfo(String customerId) {
        return null;
    }


}
