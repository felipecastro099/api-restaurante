package br.meli.apirestaurante.controllers;

import br.meli.apirestaurante.entities.Mesa;
import br.meli.apirestaurante.repositories.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mesas")
public class MesaController {
    @Autowired
    private MesaRepository mesaRepository;

    @PostMapping
    public ResponseEntity<?> store(@RequestBody  Mesa mesa) {
        return ResponseEntity.ok(mesaRepository.store(mesa));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Long id) {
        return ResponseEntity.ok(mesaRepository.findPerMesa(id));
    }
}
