package com.krishav.project.RideFlow.RideFlow.repositories;

import com.krishav.project.RideFlow.RideFlow.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {
}
