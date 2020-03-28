package com.anfegagra.di.app.domain.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Cliente {

	@Value("${cliente.nombre}")
	private String nombre;

	@Value("${cliente.apellido}")
	private String apellido;
}
