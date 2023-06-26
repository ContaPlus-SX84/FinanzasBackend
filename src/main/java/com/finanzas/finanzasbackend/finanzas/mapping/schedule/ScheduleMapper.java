package com.finanzas.finanzasbackend.finanzas.mapping.schedule;

import com.finanzas.finanzasbackend.finanzas.domain.model.entity.Schedule;
import com.finanzas.finanzasbackend.finanzas.resources.schedule.CreateScheduleResource;
import com.finanzas.finanzasbackend.finanzas.resources.schedule.ScheduleResource;
import com.finanzas.finanzasbackend.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class ScheduleMapper  implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public ScheduleResource toResource(Schedule model){
            return mapper.map(model, ScheduleResource.class);
    }

    public List<ScheduleResource> toResource(List<Schedule> model){
        return mapper.mapList(model, ScheduleResource.class);
    }

    public Schedule toModel(CreateScheduleResource resource){
        return mapper.map(resource, Schedule.class);
    }
}
