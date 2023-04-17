package com.sihai.actuatorserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 开启admin服务端
@EnableAdminServer
public class ActuatorServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorServerApplication.class, args);
    }

}
