package com.example.gcloudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GcloudTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GcloudTestApplication.class, args);
    }

}

@RestController
class heartbeat {

    @RequestMapping
    public String getHeartbeat() {
        return "BaDum";
    }
}
