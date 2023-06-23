package com.finanzas.finanzasbackend.finanzas.domain.persistence;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.FrenchMethod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FrenchMethodRepository extends JpaRepository<FrenchMethod, Long> {
    List<FrenchMethod> findByUserid(Long Id);
}
