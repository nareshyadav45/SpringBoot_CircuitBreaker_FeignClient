package com.address.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdreessConfiguration {

	@Bean
	public ModelMapper modelMapperBeans() {
		return new ModelMapper();
	}
}
