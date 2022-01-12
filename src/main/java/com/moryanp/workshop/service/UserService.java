package com.moryanp.workshop.service;

import java.util.List;
import java.util.Optional;

import com.moryanp.workshop.domain.User;
import com.moryanp.workshop.repository.UserRepository;
import com.moryanp.workshop.service.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}
