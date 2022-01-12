package com.moryanp.workshop.services;

import java.util.List;

import com.moryanp.workshop.domain.User;
import com.moryanp.workshop.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
