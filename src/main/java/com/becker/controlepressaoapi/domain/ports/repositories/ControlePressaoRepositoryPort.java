package com.becker.controlepressaoapi.domain.ports.repositories;

import com.becker.controlepressaoapi.domain.dto.DadosPressaoDTO;

import java.util.List;

public interface ControlePressaoRepositoryPort {

    void registrarPressao(DadosPressaoDTO dadosPressaoDTO);
    List<DadosPressaoDTO> listarControlePressao();
}
