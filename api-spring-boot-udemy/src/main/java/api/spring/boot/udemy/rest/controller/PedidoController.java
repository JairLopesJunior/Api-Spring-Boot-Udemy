package api.spring.boot.udemy.rest.controller;

import api.spring.boot.udemy.domain.entity.Pedido;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private PedidoService pedido;

    public PedidoController(Pedido pedido) {
        this.pedido = pedido;
    }


}
