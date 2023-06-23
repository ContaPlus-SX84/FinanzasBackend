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
