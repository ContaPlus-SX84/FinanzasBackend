package com.finanzas.finanzasbackend.finanzas.api;

import com.finanzas.finanzasbackend.finanzas.domain.service.FrenchMethodService;
import com.finanzas.finanzasbackend.finanzas.domain.service.UserService;
import com.finanzas.finanzasbackend.finanzas.mapping.frenchMethod.FrenchMethodMapper;
import com.finanzas.finanzasbackend.finanzas.mapping.user.UserMapper;
import com.finanzas.finanzasbackend.finanzas.resources.frenchMethod.FrenchMethodResource;
import com.finanzas.finanzasbackend.finanzas.resources.user.CreateUserResource;
import com.finanzas.finanzasbackend.finanzas.resources.user.UserResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*" , maxAge = 3600)
@RestController
@RequestMapping("api/v1/french_method")
public class FrenchMethodController {
    private final FrenchMethodService frenchMethodService;
    private final FrenchMethodMapper mapper;

    public FrenchMethodController(FrenchMethodService frenchMethodService, FrenchMethodMapper mapper) {
        this.frenchMethodService = frenchMethodService;
        this.mapper = mapper;
    }

    @GetMapping
    public List<FrenchMethodResource> getAll(){
        return mapper.toResource(frenchMethodService.getAll());
    }

    @GetMapping("/getId/{id}")
    public FrenchMethodResource getId(@PathVariable Long id){
        return mapper.toResource(frenchMethodService.getId(id));
    }

    @PostMapping("/create")
    public FrenchMethodResource create(@RequestBody FrenchMethodResource frenchMethod){
        return mapper.toResource(frenchMethodService.create(mapper.toModel(frenchMethod)));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return frenchMethodService.delete(id);
    }
}
