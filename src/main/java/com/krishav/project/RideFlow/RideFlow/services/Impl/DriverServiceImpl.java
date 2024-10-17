package com.krishav.project.RideFlow.RideFlow.services.Impl;

import com.krishav.project.RideFlow.RideFlow.dto.DriverDTO;
import com.krishav.project.RideFlow.RideFlow.dto.RideDTO;
import com.krishav.project.RideFlow.RideFlow.dto.RiderDTO;
import com.krishav.project.RideFlow.RideFlow.services.DriverService;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO endRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDTO rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return List.of();
    }
}
