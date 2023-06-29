package com.finanzas.finanzasbackend.finanzas.resources.schedule;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UpdateScheduleResource {
    private Double cuota;

    private String name;

    private Double tem;

    private Long tiempo;

    private Double saldoInicial;

    private Double seguroDesgravamen;

    private Double van;

    private Double tir;

    private String periodoGracia;

    private Long periodoGraciaValor;

    private Long comisiones;

    private Long userIdt;
}
