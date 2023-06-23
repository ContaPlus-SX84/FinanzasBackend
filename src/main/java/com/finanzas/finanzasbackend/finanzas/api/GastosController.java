package com.finanzas.finanzasbackend.finanzas.api;


import com.finanzas.finanzasbackend.finanzas.domain.service.FrenchMethodService;
import com.finanzas.finanzasbackend.finanzas.domain.service.GastosService;
import com.finanzas.finanzasbackend.finanzas.mapping.frenchMethod.FrenchMethodMapper;
import com.finanzas.finanzasbackend.finanzas.mapping.gastos.GastosMapper;
import com.finanzas.finanzasbackend.finanzas.resources.frenchMethod.FrenchMethodResource;
import com.finanzas.finanzasbackend.finanzas.resources.gastos.GastosResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*" , maxAge = 3600)
@RestController
@RequestMapping("api/v1/gastos")
public class GastosController {
    private final GastosService gastosService;
    private final GastosMapper mapper;

    public GastosController(GastosService gastosService, GastosMapper mapper) {
        this.gastosService = gastosService;
        this.mapper = mapper;
    }

    @GetMapping
    public List<GastosResource> getAll(){
        return mapper.toResource(gastosService.getAll());
    }

    @GetMapping("/getId/{id}")
    public GastosResource getId(@PathVariable Long id){
        return mapper.toResource(gastosService.getId(id));
    }

    @PostMapping("/create")
    public GastosResource create(@RequestBody GastosResource gastos){
        return mapper.toResource(gastosService.create(mapper.toModel(gastos)));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return gastosService.delete(id);
    }
}