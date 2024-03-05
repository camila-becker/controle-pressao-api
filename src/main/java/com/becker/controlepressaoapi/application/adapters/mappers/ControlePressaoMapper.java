package com.becker.controlepressaoapi.application.adapters.mappers;

import com.becker.controlepressaoapi.domain.dto.DadosPressaoDTO;
import com.becker.controlepressaoapi.infrastructure.adapters.entities.DadosPressaoEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class ControlePressaoMapper {

    public static DadosPressaoEntity map(DadosPressaoDTO dadosPressaoDTO) {
        return DadosPressaoEntity
                .builder()
                .nome(dadosPressaoDTO.getNome())
                .medidaDiastolica(dadosPressaoDTO.getMedidaDiastolica())
                .medidaSistolica(dadosPressaoDTO.getMedidaSistolica())
                .batimentosCardiacos(dadosPressaoDTO.getBatimentosCardiacos())
                .dataDoRegistro(LocalDateTime.now())
                .build();
    }

    public static List<DadosPressaoDTO> map(List<DadosPressaoEntity> listaDadosPressao) {
        return listaDadosPressao.stream().map(ControlePressaoMapper::mapEntityToDto).collect(Collectors.toList());
    }

    private static DadosPressaoDTO mapEntityToDto(DadosPressaoEntity entity) {
        return DadosPressaoDTO
                .builder()
                .nome(entity.getNome())
                .medidaDiastolica(entity.getMedidaDiastolica())
                .medidaSistolica(entity.getMedidaSistolica())
                .batimentosCardiacos(entity.getBatimentosCardiacos())
                .dataDoRegistro(entity.getDataDoRegistro())
                .build();
    }
}
