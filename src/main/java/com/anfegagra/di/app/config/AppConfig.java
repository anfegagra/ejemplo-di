package com.anfegagra.di.app.config;

import com.anfegagra.di.app.domain.models.ItemFactura;
import com.anfegagra.di.app.domain.models.Producto;
import com.anfegagra.di.app.domain.service.MiServicio;
import com.anfegagra.di.app.domain.service.MiServicioImpl;
import com.anfegagra.di.app.domain.service.MiServicioImpl2;
import java.util.Arrays;
import java.util.List;
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

	@Bean
	public List<ItemFactura> registrarItems() {
		Producto producto1 = new Producto("Buso UFC", 200000);
		Producto producto2 = new Producto("Camiseta UFC", 90000);

		ItemFactura linea1 = new ItemFactura(producto1, 1);
		ItemFactura linea2 = new ItemFactura(producto2, 2);

		return Arrays.asList(linea1, linea2);

	}
}
