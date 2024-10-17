package com.krishav.project.RideFlow.RideFlow.repositories;

import com.krishav.project.RideFlow.RideFlow.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
