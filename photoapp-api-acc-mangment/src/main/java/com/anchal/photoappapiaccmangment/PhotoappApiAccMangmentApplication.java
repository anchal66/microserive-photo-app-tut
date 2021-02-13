package com.anchal.photoappapiaccmangment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoappApiAccMangmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoappApiAccMangmentApplication.class, args);
    }

}
