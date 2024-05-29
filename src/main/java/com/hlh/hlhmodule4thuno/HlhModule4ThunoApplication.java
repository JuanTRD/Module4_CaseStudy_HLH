package com.hlh.hlhmodule4thuno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class HlhModule4ThunoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HlhModule4ThunoApplication.class, args);
    }

}
