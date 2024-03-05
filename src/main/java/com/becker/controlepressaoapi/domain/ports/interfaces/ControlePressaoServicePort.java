package com.becker.controlepressaoapi.domain.ports.interfaces;

import com.becker.controlepressaoapi.domain.dto.DadosPressaoDTO;
import org.apache.coyote.BadRequestException;

import java.util.List;

public interface ControlePressaoServicePort {

    void cadastrarControlePressao(DadosPressaoDTO dadosPressaoDTO) throws BadRequestException;
    List<DadosPressaoDTO> listarControlePressao();
}
