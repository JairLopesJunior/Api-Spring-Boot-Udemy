package api.spring.boot.udemy.domain.repository;

import api.spring.boot.udemy.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
