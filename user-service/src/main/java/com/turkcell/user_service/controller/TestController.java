package com.turkcell.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World from User Service"; // 8081 portundan get ıstegı aatmalıyım ö application.yaml dosyasından
                                                // ayarladım server : 8081
    }
}
