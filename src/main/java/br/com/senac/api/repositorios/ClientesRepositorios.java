package br.com.senac.api.repositorios;

import br.com.senac.api.entidades.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepositorios extends JpaRepository<Clientes,Long> {
}
