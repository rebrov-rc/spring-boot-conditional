package com.example.springbootconditional.config;

import com.example.springbootconditional.profile.DevProfile;
import com.example.springbootconditional.profile.ProductionProfile;
import com.example.springbootconditional.profile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean(name="devProfile")
    @ConditionalOnProperty(name="netology.profile.dev", havingValue = "true")
    public SystemProfile getDevProfile(){
        return new DevProfile();
    }
    @Bean(name="productionProfile")
    @ConditionalOnProperty(name="netology.profile.dev", havingValue = "false")
    public SystemProfile getProductionProfile(){
        return new ProductionProfile();
    }
}
