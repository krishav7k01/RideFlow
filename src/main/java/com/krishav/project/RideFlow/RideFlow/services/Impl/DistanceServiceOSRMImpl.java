package com.krishav.project.RideFlow.RideFlow.services.Impl;

import com.krishav.project.RideFlow.RideFlow.services.DistanceService;
import jakarta.persistence.Entity;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {
        return 0;
    }
}
