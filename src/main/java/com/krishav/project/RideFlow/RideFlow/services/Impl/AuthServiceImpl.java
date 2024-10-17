package com.krishav.project.RideFlow.RideFlow.services.Impl;

import com.krishav.project.RideFlow.RideFlow.dto.DriverDTO;
import com.krishav.project.RideFlow.RideFlow.dto.SignUpDTO;
import com.krishav.project.RideFlow.RideFlow.dto.UserDTO;
import com.krishav.project.RideFlow.RideFlow.services.AuthService;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {


    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signup(SignUpDTO signUpDTO) {
        return null;
    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
