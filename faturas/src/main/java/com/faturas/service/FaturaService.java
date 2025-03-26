package com.faturas.service;

import com.faturas.model.Fatura;
import com.faturas.repository.FaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {
    private final FaturaRepository faturaRepository;
    public FaturaService(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public List<Fatura> listarTodos(){
        return faturaRepository.findAll();
    }

    public Fatura salvar(Fatura fatura){
        return faturaRepository.save(fatura);
    }

}
