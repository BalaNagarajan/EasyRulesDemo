package com.jcircle.easyrules.spring.util;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


/**
 *
 * The purpose of this util class  - factory to return the single instance of RestTemplate or WebClient
 *
 * Author : N.Bala
 *
 *
 *
 *
 */
@Component
public class RestUtilFactory {

    /**
     * For blocking requests
     */
    private RestTemplate restTemplate;



    @Bean
    public RestTemplate getRestTemplate() {
        restTemplate = new RestTemplate();
        return restTemplate;

    }



}
