package com.krishav.project.RideFlow.RideFlow.stratergies;

import com.krishav.project.RideFlow.RideFlow.dto.RideRequestDTO;
import com.krishav.project.RideFlow.RideFlow.entities.Driver;
import com.krishav.project.RideFlow.RideFlow.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

     List<Driver> findMatchingDriver(RideRequest rideRequest);


}
