package com.example.rent_car_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rent_car_system.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}
