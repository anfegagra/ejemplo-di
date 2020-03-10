package com.anfegagra.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service
public class MiServicioImpl implements MiServicio {

	@Override
	public String hacerAlgo() {
		return "Haciendo cualquier cosa en bean1";
	}
}
