package com.example.springbootk8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerKubernetesWithYamlFileApplication {

    @GetMapping("/get")
    public String Test2(){
        return "*----This is springboot deployment application with kubernetes and docker---- part 2---* ";
    }



    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerKubernetesWithYamlFileApplication.class, args);
    }

}
