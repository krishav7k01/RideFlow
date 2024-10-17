package com.krishav.project.RideFlow.RideFlow.repositories;

import com.krishav.project.RideFlow.RideFlow.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
}
