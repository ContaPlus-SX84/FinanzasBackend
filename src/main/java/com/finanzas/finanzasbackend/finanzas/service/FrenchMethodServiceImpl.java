package com.finanzas.finanzasbackend.finanzas.service;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.FrenchMethod;
import com.finanzas.finanzasbackend.finanzas.domain.model.entity.User;
import com.finanzas.finanzasbackend.finanzas.domain.persistence.FrenchMethodRepository;
import com.finanzas.finanzasbackend.finanzas.domain.persistence.UserRepository;
import com.finanzas.finanzasbackend.finanzas.domain.service.FrenchMethodService;
import jakarta.validation.Validator;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrenchMethodServiceImpl implements FrenchMethodService {
    private static final String ENTITY = "French_method";
    private final FrenchMethodRepository frenchMethodRepository;
    private final Validator validator;

    public FrenchMethodServiceImpl(FrenchMethodRepository frenchMethodRepository, Validator validator) {
        this.frenchMethodRepository = frenchMethodRepository;
        this.validator = validator;
    }

    @Override
    public List<FrenchMethod> getAll() {
        return frenchMethodRepository.findAll();
    }

    @Override
    public FrenchMethod create(FrenchMethod frenchMethod) { return frenchMethodRepository.save(frenchMethod); }

    @Override
    public List<FrenchMethod> getUserid(Long id) {
        return frenchMethodRepository.findByUserid(id);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        frenchMethodRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
