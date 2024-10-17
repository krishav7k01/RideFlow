package com.krishav.project.RideFlow.RideFlow.services;

import com.krishav.project.RideFlow.RideFlow.dto.DriverDTO;
import com.krishav.project.RideFlow.RideFlow.dto.RideDTO;
import com.krishav.project.RideFlow.RideFlow.dto.RideRequestDTO;
import com.krishav.project.RideFlow.RideFlow.dto.RiderDTO;

import java.util.List;

public interface RiderService {

    RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);
    RideDTO cancelRide(Long rideId);

    DriverDTO rateDriver(Long rideId, Integer rating);

    DriverDTO getMyProfile();

    List<RideDTO> getAllMyRides();

}
