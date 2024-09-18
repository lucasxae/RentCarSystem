package com.example.rent_car_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rent_car_system.model.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
