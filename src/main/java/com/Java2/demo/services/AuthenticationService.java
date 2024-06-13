package com.Java2.demo.services;

import com.Java2.demo.dto.SignUpRequest;
import com.Java2.demo.entities.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
}
