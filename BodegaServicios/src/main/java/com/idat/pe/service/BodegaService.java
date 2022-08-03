package com.idat.pe.service;

import java.util.List;

import com.idat.pe.model.Bodega;

public interface BodegaService {
	
	List<Bodega> listar();
	void asignarBodegaProducto();

}
