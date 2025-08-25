package br.com.senac.api.controllers;

import br.com.senac.api.controllers.dtos.ProdutoRequestDTO;
import br.com.senac.api.entidades.Carro;
import br.com.senac.api.entidades.Produto;
import br.com.senac.api.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Produto>> listarTodos() {
        return ResponseEntity.ok(produtoService.listarTodos());
    }

    @PostMapping("/criar")
    public ResponseEntity<Produto> criar(@RequestBody ProdutoRequestDTO produto) {
        try {
            return ResponseEntity.ok(produtoService.criar(produto));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PutMapping("/atulizar/{id}")
    public ResponseEntity<Produto> atulizar(@PathVariable Long id, @RequestBody ProdutoRequestDTO produto) {

        try {
            return ResponseEntity.ok(produtoService.atulizar(id, produto));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }

    }
}