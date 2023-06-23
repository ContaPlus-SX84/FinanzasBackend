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
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;


    private Long cuoIni;

    private Long capi;

    private String titasa;

    private Long tasaporce;

    private Long tiempo;

    private String moneda;

    private Long diapago;

    private LocalDate fechaSoli;

    private String seguro;

    private LocalDate segIni;

    private LocalDate segFin;

    private String periGracia;

    private Long periMeses;

    private String tasaCom;

    private Long tasaporcen;

    private String retenNom;

    private Long retenporce;
}
