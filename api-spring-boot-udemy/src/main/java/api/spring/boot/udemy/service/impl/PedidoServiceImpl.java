package api.spring.boot.udemy.service.impl;

import api.spring.boot.udemy.domain.entity.Pedido;
import api.spring.boot.udemy.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {
    private Pedido repository;

    public PedidoServiceImpl(Pedido repository) {
        this.repository = repository;
    }
}
