package com.example.rent_car_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rent_car_system.model.Pedido;
import com.example.rent_car_system.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarTodos(){
        return pedidoRepository.findAll();
    }
    public Optional<Pedido> buscarPedidoPorId(Long id){
        return pedidoRepository.findById(id);
    }

    public Pedido adicionarPedido(Pedido obj){
      try {
        return pedidoRepository.save(obj);
      } catch (RuntimeException e) {
        throw new RuntimeException("Não foi possivel adicionar Pedido");
      }
    }
    public void deletarPdido(long id){
        try {
            pedidoRepository.deleteById(id);
            
        } catch (RuntimeException e) {
            throw  new RuntimeException("Não foi possivel deletar pedido");
        }
        
    }
    public Pedido atualizarPedido(Long id,Pedido obj){
                return pedidoRepository.findById(id).
                map(pedido->{
                    pedido.setContrato(obj.getContrato());
                    pedido.setDataPedido(obj.getDataPedido());
                    pedido.setStatus(obj.getStatus());
                    pedido.setVeiculo(obj.getVeiculo());
                    return pedidoRepository.save(pedido);
                }).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
            
    }
}
