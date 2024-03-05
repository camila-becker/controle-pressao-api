package com.becker.controlepressaoapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class DadosPressao {

    private String nome;

    private Long medidaDiastolica;

    private Long medidaSistolica;

    private Long batimentosCardiacos;
}
