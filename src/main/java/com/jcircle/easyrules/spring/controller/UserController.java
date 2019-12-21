package com.jcircle.easyrules.spring.controller;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import com.jcircle.easyrules.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcircle.easyrules.spring.model.User;



@RestController
@CrossOrigin
@RequestMapping("/v1/api")
public class UserController {

	@Autowired
	UserService userService;

	@CrossOrigin
	@GetMapping(value = "/users")
	public List<User> getUserList() {

		System.out.println("------In List----");

         List<User> userList = userService.getCustomerList();
		return userList;

	}

	/**
	 * Browser is blocking one , so the result gets rendered till all the results gets returned - you will see few seconds latency
	 * @return
	 */
	@CrossOrigin
	@GetMapping(value = "/names")
	public List<String> returnNames() {
		return Arrays.asList("James", "Philipps", "David", "Samsung");
	}



	/**
	 * In this one you will see the stream of data one by one...
	 * @return
	 */
	@CrossOrigin
	@GetMapping(value = "/stream/names", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)

	public List<String> returnStreamNamesByDelay() {
		return Arrays.asList("James","Philipps","David","Samsung");
	}



}
