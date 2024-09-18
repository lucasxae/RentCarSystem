package com.example.rent_car_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rent_car_system.model.Client;
import com.example.rent_car_system.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clienteRepository;

    public List<Client> listarTodosClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Client> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Client salvarCliente(Client cliente) {
        return clienteRepository.save(cliente);
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public Client atualizarCliente(Long id, Client clienteAtualizado) {
        return clienteRepository.findById(id)
            .map(cliente -> {
                cliente.setNome(clienteAtualizado.getNome());
                cliente.setCPF(clienteAtualizado.getCPF());
                cliente.setRG(clienteAtualizado.getRG());
                cliente.setEndereco(clienteAtualizado.getEndereco());
                cliente.setProfissao(clienteAtualizado.getProfissao());
                // cliente.setEmpregadores(clienteAtualizado.getEmpregadores());
                // cliente.setPedidos(clienteAtualizado.getPedidos());
                return clienteRepository.save(cliente);
            })
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));
    }
}