package com.krishav.project.RideFlow.RideFlow.stratergies.impl;

import com.krishav.project.RideFlow.RideFlow.dto.RideRequestDTO;
import com.krishav.project.RideFlow.RideFlow.services.DistanceService;
import com.krishav.project.RideFlow.RideFlow.stratergies.RideFareCalculation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RideFareDefaultFareCalculation implements RideFareCalculation {


    private final DistanceService distanceService;

    @Override
    public double calculateFare(RideRequestDTO rideRequestDTO) {


    }
}
