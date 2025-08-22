package br.com.senac.api.services;

import br.com.senac.api.controllers.dtos.ClienteRequestDTO;
import br.com.senac.api.entidades.Clientes;
import br.com.senac.api.repositorios.ClientesRepositorios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepositorios clientesRepositorios;

    public void criar(ClienteRequestDTO cliente){
        Clientes clientePersist = new Clientes();
        clientePersist.setNome(cliente.getNome());
        clientePersist.setSobrenome(cliente.getSobrenome());
        clientePersist.setDocumento(cliente.getDocumento());
        clientePersist.setEmail(cliente.getEmail());

        clientesRepositorios.save(clientePersist);



    }


        public List<Clientes> listarTodos(){
            return clientesRepositorios.findAll();
        }
}
