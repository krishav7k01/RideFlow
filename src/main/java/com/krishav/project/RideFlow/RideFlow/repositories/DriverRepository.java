package com.krishav.project.RideFlow.RideFlow.repositories;

import com.krishav.project.RideFlow.RideFlow.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
