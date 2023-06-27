package com.finanzas.finanzasbackend.finanzas.api;

import com.finanzas.finanzasbackend.finanzas.domain.service.ScheduleService;
import com.finanzas.finanzasbackend.finanzas.mapping.schedule.ScheduleMapper;
import com.finanzas.finanzasbackend.finanzas.resources.schedule.CreateScheduleResource;
import com.finanzas.finanzasbackend.finanzas.resources.schedule.ScheduleResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*" , maxAge = 3600)
@RestController
@RequestMapping("api/v1/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    private final ScheduleMapper mapper;

    public ScheduleController(ScheduleService scheduleService, ScheduleMapper mapper) {
        this.scheduleService = scheduleService;
        this.mapper = mapper;
    }

    @GetMapping
    public List<ScheduleResource> getAll(){
        return mapper.toResource(scheduleService.getAll());
    }
    @GetMapping("/{userid}")
    public ScheduleResource getByUserId(@PathVariable Long userId) { return mapper.toResource(scheduleService.getByUserId(userId)); }

    @PostMapping("/create")
    public ScheduleResource create(@RequestBody CreateScheduleResource schedule){
        return mapper.toResource(scheduleService.create(mapper.toModel(schedule)));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return scheduleService.delete(id);
    }
}
