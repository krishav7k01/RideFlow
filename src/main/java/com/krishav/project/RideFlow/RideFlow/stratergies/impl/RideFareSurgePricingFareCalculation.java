package com.krishav.project.RideFlow.RideFlow.stratergies.impl;

import com.krishav.project.RideFlow.RideFlow.dto.RideRequestDTO;
import com.krishav.project.RideFlow.RideFlow.stratergies.RideFareCalculation;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgePricingFareCalculation implements RideFareCalculation {

    @Override
    public double calculateFare(RideRequestDTO rideRequestDTO) {
        return 0;
    }
}
