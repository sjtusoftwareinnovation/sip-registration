package cn.edu.sjtu.sipregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SipRegistrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SipRegistrationApplication.class, args);
    }

}
