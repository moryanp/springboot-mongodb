package com.moryanp.workshop.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.moryanp.workshop.domain.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = new ArrayList<>();
        User u1 = new User("1", "Natan", "natan@email.com");
        User u2 = new User("2", "Moriso", "moriso@email.com");
        User u3 = new User("3", "Harley", "harle@email.com");
        list.addAll(Arrays.asList(u1, u2, u3));

        return ResponseEntity.ok().body(list);
    }
}
