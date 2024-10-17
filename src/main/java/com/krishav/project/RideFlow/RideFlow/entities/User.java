package com.krishav.project.RideFlow.RideFlow.entities;

import com.krishav.project.RideFlow.RideFlow.entities.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "app_user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.LAZY)  //1NF Relation Database Design
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}
