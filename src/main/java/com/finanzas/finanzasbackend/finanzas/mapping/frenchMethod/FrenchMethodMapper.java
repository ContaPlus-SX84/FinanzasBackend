package com.finanzas.finanzasbackend.finanzas.mapping.frenchMethod;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.FrenchMethod;
import com.finanzas.finanzasbackend.finanzas.domain.model.entity.User;
import com.finanzas.finanzasbackend.finanzas.resources.frenchMethod.FrenchMethodResource;
import com.finanzas.finanzasbackend.finanzas.resources.user.CreateUserResource;
import com.finanzas.finanzasbackend.finanzas.resources.user.UserResource;
import com.finanzas.finanzasbackend.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class FrenchMethodMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public FrenchMethodResource toResource(FrenchMethod model){
        return mapper.map(model, FrenchMethodResource.class);
    }

    public List<FrenchMethodResource> toResource(List<FrenchMethod> model){
        return mapper.mapList(model, FrenchMethodResource.class);
    }

    public FrenchMethod toModel(FrenchMethodResource resource){
        return mapper.map(resource, FrenchMethod.class);
    }
}
