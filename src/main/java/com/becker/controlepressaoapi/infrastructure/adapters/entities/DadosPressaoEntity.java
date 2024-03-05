package com.becker.controlepressaoapi.infrastructure.adapters.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "dados_pressao_entity")
public class DadosPressaoEntity {

    @Id
    private String id;

    private String nome;

    private Long medidaDiastolica;

    private Long medidaSistolica;

    private Long batimentosCardiacos;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Sao_Paulo")
    private LocalDateTime dataDoRegistro;
}
