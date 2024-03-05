package com.becker.controlepressaoapi.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@Builder
public class DadosPressaoDTO {

    private String nome;

    private Long medidaDiastolica;

    private Long medidaSistolica;

    private Long batimentosCardiacos;

    private LocalDateTime dataDoRegistro;
}
