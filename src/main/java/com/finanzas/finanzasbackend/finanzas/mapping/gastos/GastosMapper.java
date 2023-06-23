package com.finanzas.finanzasbackend.finanzas.mapping.gastos;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.Gastos;
import com.finanzas.finanzasbackend.finanzas.domain.model.entity.User;
import com.finanzas.finanzasbackend.finanzas.resources.gastos.GastosResource;
import com.finanzas.finanzasbackend.finanzas.resources.user.CreateUserResource;
import com.finanzas.finanzasbackend.finanzas.resources.user.UserResource;
import com.finanzas.finanzasbackend.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class GastosMapper implements Serializable {

    @Autowired
    EnhancedModelMapper mapper;

    public GastosResource toResource(Gastos model){
        return mapper.map(model, GastosResource.class);
    }

    public List<GastosResource> toResource(List<Gastos> model){
        return mapper.mapList(model, GastosResource.class);
    }

    public Gastos toModel(GastosResource resource){
        return mapper.map(resource, Gastos.class);
    }

}
