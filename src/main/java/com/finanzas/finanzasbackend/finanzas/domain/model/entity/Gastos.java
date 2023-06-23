package com.finanzas.finanzasbackend.finanzas.domain.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "gastos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@With
public class Gastos {

    @Id
    private Long id;

    private String Tipo;

    private String Nombre;

    private Long Monto;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "frenchmethodid")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private FrenchMethod frenchMethod;

}
