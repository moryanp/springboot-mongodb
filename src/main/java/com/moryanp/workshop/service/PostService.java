package com.moryanp.workshop.service;

import java.util.List;
import java.util.Optional;

import com.moryanp.workshop.domain.Post;
import com.moryanp.workshop.repository.PostRepository;
import com.moryanp.workshop.service.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> post = repository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List<Post> findByTitle(String text) {
        return repository.findByTitleContainingIgnoreCase(text);
    }

}
