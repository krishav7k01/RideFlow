package com.krishav.project.RideFlow.RideFlow.stratergies;

import com.krishav.project.RideFlow.RideFlow.dto.RideRequestDTO;

public interface RideFareCalculation {

    double calculateFare(RideRequestDTO rideRequestDTO);

}
