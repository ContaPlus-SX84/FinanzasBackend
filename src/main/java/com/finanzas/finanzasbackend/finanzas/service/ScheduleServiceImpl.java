package com.finanzas.finanzasbackend.finanzas.service;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.Schedule;
import com.finanzas.finanzasbackend.finanzas.domain.model.entity.User;
import com.finanzas.finanzasbackend.finanzas.domain.persistence.ScheduleRepository;
import com.finanzas.finanzasbackend.finanzas.domain.persistence.UserRepository;
import com.finanzas.finanzasbackend.finanzas.domain.service.ScheduleService;
import jakarta.validation.Validator;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private static final String ENTITY = "Schedule";
    private final ScheduleRepository scheduleRepository;
    private final Validator validator;

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository, Validator validator) {
        this.scheduleRepository = scheduleRepository;
        this.validator = validator;
    }

    @Override
    public List<Schedule> getAll() {
        return scheduleRepository.findAll();
    }

    @Override
    public Schedule create(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        scheduleRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
