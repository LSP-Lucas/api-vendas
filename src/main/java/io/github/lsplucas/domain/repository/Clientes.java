package io.github.lsplucas.domain.repository;

import io.github.lsplucas.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer> {

    // Query method
    List<Cliente> findByNomeLike(String nome);

    // Query method
    boolean existsByNome(String nome);

    // Query method
    void deleteByNome(String nome);

    @Query(" delete from Cliente c where c.nome = :nome ")
    @Modifying
    void deletePorNome(String nome);

    // @Query(value = " select * from cliente c where c.nome like '%:nome%' ", nativeQuery = true) // consulta nativa SQL
    @Query(value = " select c from Cliente c where c.nome like :nome ") // consulta jpql
    List<Cliente> encontrarPorNome(@Param("nome") String nome);

    @Query(" select c from Cliente c left join fetch c.pedidos where c.id = :id ")
    Cliente findClienteFetchPedidos(@Param("id") Integer id);



}
