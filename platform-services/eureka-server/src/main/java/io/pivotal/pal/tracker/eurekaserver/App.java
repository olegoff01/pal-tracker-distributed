package io.pivotal.pal.tracker.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer
@SpringBootApplication
@ComponentScan("io.pivotal.pal.tracker.eurekaserver")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}