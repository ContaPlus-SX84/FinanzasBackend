package com.finanzas.finanzasbackend.finanzas.resources.schedule;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UpdateScheduleResource {
    private Double cuota;

    private String name;

    private Double tem;

    private Double saldoInicial;

    private Double seguroDesgravamen;

    private Double van;

    private Double tir;

    private Long userIdt;
}
