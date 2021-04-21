package api.spring.boot.udemy.domain.repository;

import api.spring.boot.udemy.domain.entity.Cliente;
import api.spring.boot.udemy.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedidos> findByCliente(Cliente cliente);
}
