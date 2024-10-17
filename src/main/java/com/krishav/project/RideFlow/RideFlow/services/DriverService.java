package com.krishav.project.RideFlow.RideFlow.services;

import com.krishav.project.RideFlow.RideFlow.dto.DriverDTO;
import com.krishav.project.RideFlow.RideFlow.dto.RideDTO;
import com.krishav.project.RideFlow.RideFlow.dto.RiderDTO;

import java.util.List;

public interface DriverService {

RideDTO cancelRide(Long rideId);
RideDTO startRide(Long rideId);
RideDTO endRide(Long rideId);
RideDTO acceptRide(Long rideId);

RiderDTO rateRider(Long rideId, Integer rating);

DriverDTO getMyProfile();

List<RideDTO> getAllMyRides();


}
