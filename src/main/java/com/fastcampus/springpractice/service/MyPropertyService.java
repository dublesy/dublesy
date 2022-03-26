package com.fastcampus.springpractice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class MyPropertyService {

    private final Integer height;

    public MyPropertyService(@Value("${my.height}") Integer height) {
        this.height = height;
    }

    public Integer getMyHeight() {
        return height;
    }
}