package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.project.service"})
@ComponentScan(basePackages={"com.project.controller"})
@EntityScan("com.project.model")
@EnableJpaRepositories("com.project.repository")
public class ProjectPRJApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectPRJApplication.class, args);
    }


}
