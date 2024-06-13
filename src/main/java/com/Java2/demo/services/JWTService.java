package com.Java2.demo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public interface JWTService {

    String extractUserName(String token);

    boolean isTokenValid(String token, UserDetails userDetails);
    String generateToken(UserDetails userDetails);

}
