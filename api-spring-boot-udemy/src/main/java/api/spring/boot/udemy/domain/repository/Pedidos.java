package api.spring.boot.udemy.domain.repository;

import api.spring.boot.udemy.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
}
