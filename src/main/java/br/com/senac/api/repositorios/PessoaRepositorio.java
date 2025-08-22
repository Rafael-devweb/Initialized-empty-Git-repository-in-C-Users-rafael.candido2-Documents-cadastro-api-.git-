package br.com.senac.api.repositorios;


import br.com.senac.api.entidades.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {

}
