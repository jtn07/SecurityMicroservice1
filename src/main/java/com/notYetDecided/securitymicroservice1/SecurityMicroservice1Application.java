package com.notYetDecided.securitymicroservice1;

import com.notYetDecided.securitymicroservice1.Models.User;
import com.notYetDecided.securitymicroservice1.Repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SecurityMicroservice1Application {

    public static void main(String[] args) {
        SpringApplication.run(SecurityMicroservice1Application.class, args);
    }

}
