package com.eriksgda.api.service.user.implementation;

import com.eriksgda.api.model.user.User;
import com.eriksgda.api.repository.user.UserRepository;
import com.eriksgda.api.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(UUID id) {
        return this.repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if (this.repository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("User already exists.");

        }
        return this.repository.save(user);
    }
}
