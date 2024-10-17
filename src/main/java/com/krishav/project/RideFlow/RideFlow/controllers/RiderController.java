package com.krishav.project.RideFlow.RideFlow.controllers;

import com.krishav.project.RideFlow.RideFlow.dto.RideRequestDTO;
import com.krishav.project.RideFlow.RideFlow.services.RiderService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
public class RiderController {

    private final RiderService riderService;

    @PostMapping("/requestRide")
    public ResponseEntity<RideRequestDTO> requestDTO(@RequestBody RideRequestDTO rideRequestDTO)
    {
        return ResponseEntity.ok(riderService.requestRide(rideRequestDTO));

    }



}
