package com.ak.config;

import com.ak.toolkits.RaceFormatter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by arthur on 8/2/17.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.ak")
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addFormatters(FormatterRegistry registry) {
       registry.addFormatter(new RaceFormatter());
    }
}
