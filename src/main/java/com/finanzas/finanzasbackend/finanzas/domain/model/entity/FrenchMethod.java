package com.finanzas.finanzasbackend.finanzas.domain.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import java.time.*;
import java.time.format.*;

import java.io.Serializable;

@Entity
@Table(name = "french_method")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@With
public class FrenchMethod implements Serializable{

    @Id
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
