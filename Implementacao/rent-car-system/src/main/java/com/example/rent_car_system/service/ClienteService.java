package com.example.rent_car_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rent_car_system.exceptions.ClienteDuplicadoException;
import com.example.rent_car_system.model.Cliente;
import com.example.rent_car_system.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodosClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente salvarCliente(Cliente cliente) {
        if(clienteRepository.existsByCPF(cliente.getCPF())) {
            throw new ClienteDuplicadoException("O cliente já existe!");
        }
        return clienteRepository.save(cliente);
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente atualizarCliente(Long id, Cliente clienteAtualizado) {
        return clienteRepository.findById(id)
            .map(cliente -> {
                cliente.setCPF(clienteAtualizado.getCPF());
                cliente.setRG(clienteAtualizado.getRG());
                cliente.setNome(clienteAtualizado.getNome());
                cliente.setEndereco(clienteAtualizado.getEndereco());
                cliente.setProfissao(clienteAtualizado.getProfissao());
                cliente.setEmpregadores(clienteAtualizado.getEmpregadores());
                cliente.setPedidos(clienteAtualizado.getPedidos());
                return clienteRepository.save(cliente);
            })
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));
    }
}