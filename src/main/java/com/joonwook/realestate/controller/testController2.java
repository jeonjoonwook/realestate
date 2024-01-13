package com.joonwook.realestate.controller;

import com.joonwook.realestate.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController2 {
    @Autowired
    TestService testService;

    @GetMapping("/hi")
    public void test(){
        System.out.println(testService.test().getAptNm());
    }
}
