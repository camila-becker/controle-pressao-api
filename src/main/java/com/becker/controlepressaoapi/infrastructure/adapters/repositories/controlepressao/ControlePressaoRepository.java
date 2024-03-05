package com.becker.controlepressaoapi.infrastructure.adapters.repositories.controlepressao;

import com.becker.controlepressaoapi.application.adapters.mappers.ControlePressaoMapper;
import com.becker.controlepressaoapi.domain.dto.DadosPressaoDTO;
import com.becker.controlepressaoapi.domain.ports.repositories.ControlePressaoRepositoryPort;
import com.becker.controlepressaoapi.infrastructure.adapters.entities.DadosPressaoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ControlePressaoRepository implements ControlePressaoRepositoryPort {

    private final SpringControlePressaoRespository respository;

    @Override
    public void registrarPressao(DadosPressaoDTO dadosPressaoDTO) {
        respository.save(ControlePressaoMapper.map(dadosPressaoDTO));
    }

    @Override
    public List<DadosPressaoDTO> listarControlePressao() {
        List<DadosPressaoEntity> listaDadosPressao = respository.findAll();
        return ControlePressaoMapper.map(listaDadosPressao);
    }
}
