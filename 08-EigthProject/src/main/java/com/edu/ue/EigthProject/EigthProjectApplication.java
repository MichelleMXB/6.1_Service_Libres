package com.edu.ue.EigthProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//Michelle Xiomara Molano Bohorquez 14-B
@SpringBootApplication
public class EigthProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(EigthProjectApplication.class, args);
    }
    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    }
}
