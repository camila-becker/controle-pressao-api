package com.becker.controlepressaoapi.infrastructure.adapters.repositories.controlepressao;

import com.becker.controlepressaoapi.infrastructure.adapters.entities.DadosPressaoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringControlePressaoRespository extends MongoRepository<DadosPressaoEntity, UUID> {
}
