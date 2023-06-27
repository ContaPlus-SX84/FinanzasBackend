package com.finanzas.finanzasbackend.finanzas.domain.service;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.Schedule;
import com.finanzas.finanzasbackend.finanzas.resources.schedule.ScheduleResource;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getAll();
    List<Schedule> getByUserIdt(Long userId);
    Schedule create(Schedule schedule);
    ResponseEntity<?> delete(Long id);
}

