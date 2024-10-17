package com.krishav.project.RideFlow.RideFlow.services;

import com.krishav.project.RideFlow.RideFlow.dto.DriverDTO;
import com.krishav.project.RideFlow.RideFlow.dto.SignUpDTO;
import com.krishav.project.RideFlow.RideFlow.dto.UserDTO;

public interface AuthService {

    String login(String email, String password);

    UserDTO signup(SignUpDTO signUpDTO);

    DriverDTO onboardNewDriver(Long userId);

}
