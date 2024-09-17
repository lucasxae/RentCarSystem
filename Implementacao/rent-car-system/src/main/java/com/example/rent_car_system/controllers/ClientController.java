package com.example.rent_car_system.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rent_car_system.model.Client;
import com.example.rent_car_system.service.ClientService;

@RestController
@RequestMapping("/clientes")
public class ClientController {
    
    @Autowired
    private ClientService clienteService;

    @GetMapping
    public List<Client> listarTodos() {
        return clienteService.listarTodosClientes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> buscarPorId(@PathVariable Long id) {
        Optional<Client> cliente = clienteService.buscarClientePorId(id);
        if (cliente.isPresent()) {
            return ResponseEntity.ok(cliente.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Client criarCliente(@RequestBody Client cliente) {
        return clienteService.salvarCliente(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> atualizarCliente(@PathVariable Long id, @RequestBody Client clienteAtualizado) {
        try {
            Client cliente = clienteService.atualizarCliente(id, clienteAtualizado);
            return ResponseEntity.ok(cliente);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id) {
        clienteService.deletarCliente(id);
        return ResponseEntity.noContent().build();
    }
}
