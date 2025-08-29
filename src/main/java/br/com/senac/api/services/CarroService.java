package br.com.senac.api.services;

import br.com.senac.api.controllers.CarroRequestDTO;
import br.com.senac.api.entidades.Carro;
import br.com.senac.api.repositorios.CarroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepositorio carroRepositorio;

    public List<Carro> listarTodos(){
        return carroRepositorio.findAll();
    }
    public  Carro criar(CarroRequestDTO carro){
        Carro carroPersist = new Carro();
        carroPersist.setMarca(carro.getMarca());
        carroPersist.setModelo(carro.getModelo());

        return carroRepositorio.save(carroPersist);
    }

    public Carro atualizar(Long id, CarroRequestDTO carro ) throws Exception {
        if(carroRepositorio.existsById(id) == false){
            throw new Exception("Registro não encontrado");

        }
        Carro carroPersit = new Carro();
        carroPersit.setModelo(carro.getModelo());
        carroPersit.setMarca(carro.getMarca());
        carroPersit.setId(id);

        return carroRepositorio.save(carroPersit);
    }
    public void deletar(Long id) {
        if (!carroRepositorio.existsById(id)) {
            throw new RuntimeException("Registro não encontrado");
        }

        carroRepositorio.deleteById(id);
    }
}