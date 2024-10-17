package com.krishav.project.RideFlow.RideFlow.services.Impl;

import com.krishav.project.RideFlow.RideFlow.dto.RideRequestDTO;
import com.krishav.project.RideFlow.RideFlow.entities.Driver;
import com.krishav.project.RideFlow.RideFlow.entities.Ride;
import com.krishav.project.RideFlow.RideFlow.entities.enums.RideStatus;
import com.krishav.project.RideFlow.RideFlow.services.RideService;
import jakarta.persistence.Entity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {


    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDTO rideRequestDTO) {

    }

    @Override
    public Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
