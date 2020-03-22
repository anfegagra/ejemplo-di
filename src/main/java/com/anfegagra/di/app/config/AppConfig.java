package com.anfegagra.di.app.config;

import com.anfegagra.di.app.domain.service.MiServicio;
import com.anfegagra.di.app.domain.service.MiServicioImpl;
import com.anfegagra.di.app.domain.service.MiServicioImpl2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	@Primary
	@Bean
	public MiServicio miServicio() {
		return new MiServicioImpl();
	}

	@Bean("miServicioImpl2")
	public MiServicio miServicio2() {
		return new MiServicioImpl2();
	}
}
