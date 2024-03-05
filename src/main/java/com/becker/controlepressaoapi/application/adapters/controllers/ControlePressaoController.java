package com.becker.controlepressaoapi.application.adapters.controllers;

import com.becker.controlepressaoapi.domain.dto.DadosPressaoDTO;
import com.becker.controlepressaoapi.domain.ports.interfaces.ControlePressaoServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("pressao")
public class ControlePressaoController {

    private final ControlePressaoServicePort service;

    @PostMapping
    @CrossOrigin("*")
    ResponseEntity<Object> cadastrarControlePressao(@RequestBody DadosPressaoDTO dadosPressaoDTO) {
        try {
            service.cadastrarControlePressao(dadosPressaoDTO);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping
    @CrossOrigin("*")
    ResponseEntity<List<DadosPressaoDTO>> listarControlePressao() {
        return ResponseEntity.ok(service.listarControlePressao());
    }

}
