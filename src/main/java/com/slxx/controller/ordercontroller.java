package com.slxx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
public class ordercontroller {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/order/docker")
    public String helloDocker() {
        System.out.println("git change");
        return "hello docker " + "\t" + port + "\t" + UUID.randomUUID().toString();
    }

}
