package com.finanzas.finanzasbackend.finanzas.service;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.FrenchMethod;
import com.finanzas.finanzasbackend.finanzas.domain.model.entity.Gastos;
import com.finanzas.finanzasbackend.finanzas.domain.persistence.FrenchMethodRepository;
import com.finanzas.finanzasbackend.finanzas.domain.persistence.GastosRepository;
import com.finanzas.finanzasbackend.finanzas.domain.service.FrenchMethodService;
import com.finanzas.finanzasbackend.finanzas.domain.service.GastosService;
import jakarta.validation.Validator;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class GastosServiceImpl implements GastosService {
    private static final String ENTITY = "Gastos";
    private final GastosRepository gastosRepository;
    private final Validator validator;

    public GastosServiceImpl(GastosRepository gastosRepository, Validator validator) {
        this.gastosRepository = gastosRepository;
        this.validator = validator;
    }

    @Override
    public List<Gastos> getAll() {
        return gastosRepository.findAll();
    }

    @Override
    public Gastos create(Gastos gastos) { return gastosRepository.save(gastos); }

    @Override
    public List<Gastos> getId(Long id) {
        return gastosRepository.findByFrenchmethodid(id);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        gastosRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
