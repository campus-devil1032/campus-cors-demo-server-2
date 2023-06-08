package com.campus.campuscorsdemoserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CampusCorsDemoServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(CampusCorsDemoServer2Application.class, args);
    }

    @Controller
    public static class MyController {

        @GetMapping("/")
        public String getData(Model model) {
            return "index";
        }
    }
}
