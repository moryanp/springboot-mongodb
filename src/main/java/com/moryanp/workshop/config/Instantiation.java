package com.moryanp.workshop.config;

import java.util.Arrays;

import com.moryanp.workshop.domain.User;
import com.moryanp.workshop.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User u1 = new User(null, "Maurício Fontana", "fonfon@email.com");
        User u2 = new User(null, "Alisson Flecha", "harley@email.com");
        User u3 = new User(null, "Natan Paredes", "tantan@email.com");

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
    }
}
