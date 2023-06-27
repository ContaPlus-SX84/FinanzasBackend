package com.finanzas.finanzasbackend.finanzas.domain.persistence;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.Schedule;
import com.finanzas.finanzasbackend.finanzas.resources.schedule.ScheduleResource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByUserIdt(Long userId);

}
