package br.meli.apirestaurante.controllers;

import br.meli.apirestaurante.entities.Caixa;
import br.meli.apirestaurante.repositories.CaixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caixa")
public class CaixaController {

    @Autowired
    private CaixaRepository caixaRepository;

    @GetMapping
    public ResponseEntity<?> index() {
        return ResponseEntity.ok(caixaRepository.list());
    }
}
