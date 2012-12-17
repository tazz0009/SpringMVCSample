package com.dynastudios.example.configuration;

import com.dynastudios.example.controller.SampleController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Patrick Trautmann
 * <p/>
 * Contact: patrick.trautmann@gmail.com
 * Date: 17.12.12
 * Time: 21:20
 */
@Configuration
@EnableWebMvc
public class ControllerConfiguration {

    @Bean
    @Scope("request")
    public SampleController sampleController() {
        return new SampleController();
    }

}
