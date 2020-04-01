package com.university.myfitnessapp.service;

import com.university.myfitnessapp.repository.models.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
