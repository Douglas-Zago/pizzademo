package com.senac.pizzademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.pizzademo.model.Cardapio;
import com.senac.pizzademo.repository.CardapioRepository;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {

    @Autowired
    private CardapioRepository cardapioRepository;

    // Método GET para listar todos os cardápios
    @GetMapping
    public List<Cardapio> getAllCardapios() {
        return cardapioRepository.findAll();
    }

    // Método POST para criar um novo cardápio
    @PostMapping
    public Cardapio createCardapio(@RequestBody Cardapio cardapio) {
        return cardapioRepository.save(cardapio);
    }
} 
