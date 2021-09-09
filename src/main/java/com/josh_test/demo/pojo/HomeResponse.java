package com.josh_test.demo.pojo;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;

public class HomeResponse {
    private final String username;
    private final String age;

    public HomeResponse(String username, String age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getAge() {
        return age;
    }

}