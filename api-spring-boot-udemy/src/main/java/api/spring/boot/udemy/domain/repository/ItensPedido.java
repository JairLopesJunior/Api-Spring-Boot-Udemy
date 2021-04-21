package api.spring.boot.udemy.domain.repository;

import api.spring.boot.udemy.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedido extends JpaRepository<ItemPedido, Integer> {
}
