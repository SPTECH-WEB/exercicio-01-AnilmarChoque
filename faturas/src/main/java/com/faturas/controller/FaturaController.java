package com.faturas.controller;

import com.faturas.model.Fatura;
import com.faturas.service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    private final FaturaService faturaService;

    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
    }

    @GetMapping
    public List<Fatura> listarBoletos(){
        return faturaService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Fatura> criarBoleto(@Valid @RequestBody Fatura fatura){
        Fatura novaFatura = faturaService.salvar(fatura);
        return ResponseEntity.ok(novaFatura);
    }
}
