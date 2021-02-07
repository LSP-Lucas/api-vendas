package io.github.lsplucas.domain.repository;

import io.github.lsplucas.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
