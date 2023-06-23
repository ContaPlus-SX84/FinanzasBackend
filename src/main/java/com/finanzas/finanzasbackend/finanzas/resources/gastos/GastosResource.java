package com.finanzas.finanzasbackend.finanzas.resources.gastos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.finanzas.finanzasbackend.finanzas.domain.model.entity.FrenchMethod;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class GastosResource {

    private Long id;

    private String Tipo;

    private String Nombre;

    private Long Monto;

}
