package com.finanzas.finanzasbackend.finanzas.domain.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "schedule")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@With
public class Schedule implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double cuota;

    private Double tem;

    private Double saldoInicial;

    private Double seguroDesgravamen;

    private Double van;

    private Double tir;

    private String periodoGracia;

    private Long periodoGraciaValor;

    private Long comisiones;

    private Long userIdt;
}
