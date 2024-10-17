package com.krishav.project.RideFlow.RideFlow.dto;

import com.krishav.project.RideFlow.RideFlow.entities.Driver;
import com.krishav.project.RideFlow.RideFlow.entities.Rider;
import com.krishav.project.RideFlow.RideFlow.entities.enums.PaymentMethod;
import com.krishav.project.RideFlow.RideFlow.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDTO {


    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime creationTime;
    private RideDTO rider;
    private DriverDTO driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private String otp;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;


}
