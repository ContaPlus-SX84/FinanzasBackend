package com.finanzas.finanzasbackend.finanzas.domain.persistence;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    Schedule findByUserId(Long userId);

}
