package com.krishav.project.RideFlow.RideFlow.stratergies.impl;

import com.krishav.project.RideFlow.RideFlow.entities.Driver;
import com.krishav.project.RideFlow.RideFlow.entities.RideRequest;
import com.krishav.project.RideFlow.RideFlow.stratergies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return List.of();
    }
}
