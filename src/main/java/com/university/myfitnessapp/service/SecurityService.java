package com.university.myfitnessapp.service;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
