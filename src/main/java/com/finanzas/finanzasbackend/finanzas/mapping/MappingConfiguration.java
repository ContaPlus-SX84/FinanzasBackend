package com.finanzas.finanzasbackend.finanzas.mapping;

import com.finanzas.finanzasbackend.finanzas.mapping.frenchMethod.FrenchMethodMapper;
import com.finanzas.finanzasbackend.finanzas.mapping.gastos.GastosMapper;
import com.finanzas.finanzasbackend.finanzas.mapping.user.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration("FinanzasApiConfiguration")
public class MappingConfiguration implements Serializable {
    @Bean
    public UserMapper userMapper() { return new UserMapper(); }

    @Bean
    public FrenchMethodMapper frenchMethodMapper() { return new FrenchMethodMapper(); }

    @Bean
    public GastosMapper gastosMapper() { return new GastosMapper(); }

}