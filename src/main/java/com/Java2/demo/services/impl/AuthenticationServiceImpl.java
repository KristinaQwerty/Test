package com.Java2.demo.services.impl;

import com.Java2.demo.dto.SignUpRequest;
import com.Java2.demo.entities.Role;
import com.Java2.demo.entities.User;
import com.Java2.demo.repository.UserRepository;
import com.Java2.demo.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {


    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User signup(SignUpRequest signUpRequest){
        User user = new User();

        user.setEmail(signUpRequest.getEmail());
        user.setFirstName(signUpRequest.getFirstName());
        user.setSecondName(signUpRequest.getLastName());
        user.setRole(Role.USER);
        user.setPassword(passwordEncoder.encode(signUpRequest.getPasssword()));

        return userRepository.save(user);
    }
}
