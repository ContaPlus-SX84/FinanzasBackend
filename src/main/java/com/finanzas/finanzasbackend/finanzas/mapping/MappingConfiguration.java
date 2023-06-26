package com.finanzas.finanzasbackend.finanzas.mapping;

import com.finanzas.finanzasbackend.finanzas.mapping.schedule.ScheduleMapper;
import com.finanzas.finanzasbackend.finanzas.mapping.user.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration("FinanzasApiConfiguration")
public class MappingConfiguration implements Serializable {
    @Bean
    public UserMapper userMapper() { return new UserMapper(); }

    @Bean
    public ScheduleMapper scheduleMapper() { return new ScheduleMapper(); }
}