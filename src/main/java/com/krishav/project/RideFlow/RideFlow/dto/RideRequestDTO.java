package com.krishav.project.RideFlow.RideFlow.dto;

import com.krishav.project.RideFlow.RideFlow.entities.Driver;
import com.krishav.project.RideFlow.RideFlow.entities.Rider;
import com.krishav.project.RideFlow.RideFlow.entities.enums.PaymentMethod;
import com.krishav.project.RideFlow.RideFlow.entities.enums.RideRequestStatus;
import com.krishav.project.RideFlow.RideFlow.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDTO {


    private Long id;
    private PointDTO pickupLocation;
    private PointDTO dropOffLocation;
    private LocalDateTime creationTime;
    private RiderDTO rider;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideStatus;

}
