package com.becker.controlepressaoapi.application.adapters.validations;

import com.becker.controlepressaoapi.domain.dto.DadosPressaoDTO;
import org.apache.coyote.BadRequestException;

import java.util.Objects;

public class ValidarDadosPressao {

    public static void validar(DadosPressaoDTO dadosPressaoDTO) throws BadRequestException {
        validarNome(dadosPressaoDTO.getNome());
        validarDadosPressao(dadosPressaoDTO.getMedidaDiastolica(), "Favor informar o valor da medida diastólica.");
        validarDadosPressao(dadosPressaoDTO.getMedidaSistolica(), "Favor informar o valor da medida sistólica.");
        validarDadosPressao(dadosPressaoDTO.getBatimentosCardiacos(), "Favor informar o valor dos batimentos cardíacos.");
    }

    private static void validarNome(String nome) throws BadRequestException {
        if(Objects.isNull(nome) || nome.isBlank()){
            throw new BadRequestException("Favor informar o nome.");
        }
    }

    private static void validarDadosPressao(Long valor, String msgErro) throws BadRequestException {
        if(Objects.isNull(valor) || valor == 0) {
            throw new BadRequestException(msgErro);
        }
    }
}
