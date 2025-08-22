package br.com.senac.api.controllers;

import br.com.senac.api.controllers.dtos.PessoaRequestDTO;
import br.com.senac.api.entidades.Carro;
import br.com.senac.api.entidades.Pessoa;
import br.com.senac.api.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

        @Autowired
        private PessoaService pessoaService;

        @GetMapping("/listar")
        public ResponseEntity<List<Pessoa>> listarTodos(){
            return ResponseEntity.ok(pessoaService.listarTodos());
        }

        public ResponseEntity<Pessoa> criar(@RequestBody PessoaRequestDTO pessoa){
            try{
                return ResponseEntity.ok(pessoaService.criar(pessoa));

            }catch (Exception e){
                e.printStackTrace();
                return ResponseEntity.badRequest().body(null);
            }
        }

    }


