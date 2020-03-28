package com.anfegagra.di.app.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ItemFactura {

	private Producto producto;
	private Integer cantidad;


}
