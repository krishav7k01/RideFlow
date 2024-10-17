package com.krishav.project.RideFlow.RideFlow.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    double calculateDistance(Point src, Point dest);


}
