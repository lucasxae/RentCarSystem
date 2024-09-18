package com.example.rent_car_system.exceptions;

public class ClienteDuplicadoException extends RuntimeException {
    public ClienteDuplicadoException(String mensagem) {
        super(mensagem);
    }
}