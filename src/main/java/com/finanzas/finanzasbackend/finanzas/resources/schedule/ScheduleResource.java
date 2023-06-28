package com.finanzas.finanzasbackend.finanzas.resources.schedule;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleResource {
    private Long id;

    private Double cuota;

    private String name;

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

