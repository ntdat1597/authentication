package com.example.authentication.service;

import com.example.authentication.model.User;

public interface UserService  {
    void save(User user);

    User findByUsername(String username);
}
