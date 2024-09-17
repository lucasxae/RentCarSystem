package com.example.rent_car_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String RG;
    private String CPF;
    private String nome;
    private String endereco;
    private String profissao;
    
    // @OneToMany
    // private List<Empregador> empregadores;

    // @OneToMany
    // private List<Pedido> pedidos;

    public Client() {

    }

    public Client(String RG, String CPF, String nome, String endereco, String profissao) {
        this.RG = RG;
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.profissao = profissao;
        // this.empregadores = empregadores;
        // this.pedidos = pedidos;
    }

    public Long getId() {
        return this.id;
    }

    public String getRG() {
        return this.RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // public List<Empregador> getEmpregadores() {
    //     return this.empregadores;
    // }

    // public void setEmpregadores(List<Empregador> empregadores) {
    //     this.empregadores = empregadores;
    // }

    // public List<Pedido> getPedidos() {
    //     return this.pedidos;
    // }

    // public void setPedidos(List<Pedido> pedidos) {
    //     this.pedidos = pedidos;
    // }
}