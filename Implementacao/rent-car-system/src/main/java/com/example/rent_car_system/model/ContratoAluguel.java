package com.example.rent_car_system.model;

import com.example.rent_car_system.enums.DuracaoContrato;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ContratoAluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private Integer duracao;
    private Boolean opcaoCompra;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    private ContratoCredito contratoCredito;

    @Enumerated(EnumType.STRING)
    private DuracaoContrato duracaoContrato;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Boolean getOpcaoCompra() {
        return opcaoCompra;
    }

    public void setOpcaoCompra(Boolean opcaoCompra) {
        this.opcaoCompra = opcaoCompra;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public ContratoCredito getContratoCredito() {
        return contratoCredito;
    }

    public void setContratoCredito(ContratoCredito contratoCredito) {
        this.contratoCredito = contratoCredito;
    }

    public DuracaoContrato getDuracaoContrato() {
        return duracaoContrato;
    }

    public void setDuracaoContrato(DuracaoContrato duracaoContrato) {
        this.duracaoContrato = duracaoContrato;
    }
}
