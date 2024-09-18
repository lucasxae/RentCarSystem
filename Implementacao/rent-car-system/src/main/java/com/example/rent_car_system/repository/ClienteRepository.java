package com.example.rent_car_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rent_car_system.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    boolean existsByCPF(String CPF);
}
