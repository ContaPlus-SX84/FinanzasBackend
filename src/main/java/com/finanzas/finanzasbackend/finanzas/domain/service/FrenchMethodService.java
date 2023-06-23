package com.finanzas.finanzasbackend.finanzas.domain.service;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.FrenchMethod;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FrenchMethodService {
    List<FrenchMethod> getAll();

    List<FrenchMethod> getId(Long id);
    FrenchMethod create(FrenchMethod frenchMethod);

    ResponseEntity<?> delete(Long id);
}
