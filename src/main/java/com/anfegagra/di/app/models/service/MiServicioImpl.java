package com.anfegagra.di.app.models.service;

import org.springframework.stereotype.Service;

@Service
public class MiServicioImpl implements MiServicio {

	@Override
	public String hacerAlgo() {
		return "Haciendo cualquier cosa!";
	}
}
