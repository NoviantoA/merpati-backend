package com.novianto.merpatibackend.service;

import com.novianto.merpatibackend.dto.RegisterRequest;
import com.novianto.merpatibackend.model.User;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    User get(UUID userId);
    User getRef(UUID userId);
    Optional<User> findByEmailIgnoreCase(String email);
    Map<String, Object> create(RegisterRequest newUserData);
}
