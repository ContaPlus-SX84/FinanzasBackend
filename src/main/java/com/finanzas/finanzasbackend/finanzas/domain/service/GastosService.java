package com.finanzas.finanzasbackend.finanzas.domain.service;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.Gastos;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GastosService {
    List<Gastos> getAll();

    List<Gastos> getId(Long id);
    Gastos create(Gastos gastos);

    ResponseEntity<?> delete(Long id);
}
