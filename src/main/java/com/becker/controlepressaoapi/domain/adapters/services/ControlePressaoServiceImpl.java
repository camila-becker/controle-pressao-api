package com.becker.controlepressaoapi.domain.adapters.services;

import com.becker.controlepressaoapi.application.adapters.validations.ValidarDadosPressao;
import com.becker.controlepressaoapi.domain.dto.DadosPressaoDTO;
import com.becker.controlepressaoapi.domain.ports.interfaces.ControlePressaoServicePort;
import com.becker.controlepressaoapi.domain.ports.repositories.ControlePressaoRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;

import java.util.List;

@RequiredArgsConstructor
public class ControlePressaoServiceImpl implements ControlePressaoServicePort {

    private final ControlePressaoRepositoryPort repository;

    @Override
    public void cadastrarControlePressao(DadosPressaoDTO dadosPressaoDTO) throws BadRequestException {
        ValidarDadosPressao.validar(dadosPressaoDTO);
        repository.registrarPressao(dadosPressaoDTO);
    }

    @Override
    public List<DadosPressaoDTO> listarControlePressao() {
        return repository.listarControlePressao();
    }
}
