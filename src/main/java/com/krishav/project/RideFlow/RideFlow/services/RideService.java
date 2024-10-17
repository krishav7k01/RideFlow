package com.krishav.project.RideFlow.RideFlow.services;

import com.krishav.project.RideFlow.RideFlow.dto.RideRequestDTO;
import com.krishav.project.RideFlow.RideFlow.entities.Driver;
import com.krishav.project.RideFlow.RideFlow.entities.Ride;
import com.krishav.project.RideFlow.RideFlow.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDTO rideRequestDTO); //this will notify all the drivers

    Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesDriver(Long driverId, PageRequest pageRequest);

}
