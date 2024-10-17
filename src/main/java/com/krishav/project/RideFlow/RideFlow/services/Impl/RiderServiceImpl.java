package com.krishav.project.RideFlow.RideFlow.services.Impl;

import com.krishav.project.RideFlow.RideFlow.dto.DriverDTO;
import com.krishav.project.RideFlow.RideFlow.dto.RideDTO;
import com.krishav.project.RideFlow.RideFlow.dto.RideRequestDTO;
import com.krishav.project.RideFlow.RideFlow.entities.RideRequest;
import com.krishav.project.RideFlow.RideFlow.entities.enums.RideRequestStatus;
import com.krishav.project.RideFlow.RideFlow.repositories.RideRequestRepository;
import com.krishav.project.RideFlow.RideFlow.services.RiderService;
import com.krishav.project.RideFlow.RideFlow.stratergies.DriverMatchingStrategy;
import com.krishav.project.RideFlow.RideFlow.stratergies.RideFareCalculation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareCalculation rideFareCalculation;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RideRequestRepository rideRequestRepository;

    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {

        RideRequest rideRequest = modelMapper.map(rideRequestDTO, RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare = rideFareCalculation.calculateFare(rideRequestDTO);
        rideRequest.setFare(fare);

        RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);

        driverMatchingStrategy.findMatchingDriver(rideRequest);


        return modelMapper.map(savedRideRequest, RideRequestDTO.class);
    }

    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDTO rateDriver(Long rideId, Integer rating) {
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
