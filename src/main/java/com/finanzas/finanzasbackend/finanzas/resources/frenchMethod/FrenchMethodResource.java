package com.finanzas.finanzasbackend.finanzas.resources.frenchMethod;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.finanzas.finanzasbackend.finanzas.domain.model.entity.User;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class FrenchMethodResource {


    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;


    private Long CuoIni;

    private Long Capi;

    private String Titasa;

    private Long Tasaporce;

    private Long Tiempo;

    private String Moneda;

    private Long Diapago;

    private LocalDate FechaSoli;

    private String Seguro;

    private LocalDate SegIni;

    private LocalDate SegFin;

    private String PeriGracia;

    private Long PeriMeses;

    private String TasaCom;

    private Long Tasaporcen;

    private String RetenNom;

    private Long Retenporce;
}
