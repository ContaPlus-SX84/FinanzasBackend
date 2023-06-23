package com.finanzas.finanzasbackend.finanzas.domain.persistence;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.FrenchMethod;
import com.finanzas.finanzasbackend.finanzas.domain.model.entity.Gastos;
import com.finanzas.finanzasbackend.finanzas.domain.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GastosRepository extends JpaRepository<Gastos, Long> {
    List<Gastos> findByFrenchmethodid(Long Id);
}
