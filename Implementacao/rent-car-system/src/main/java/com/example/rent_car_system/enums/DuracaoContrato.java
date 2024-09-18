package com.example.rent_car_system.enums;

public enum DuracaoContrato {
    DOZE(12),
    VINTE_QUATRO(24),
    TRINTA_SEIS(36),
    QUARENTA_OITO(48);

    private final int duracao;

    DuracaoContrato(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }
}