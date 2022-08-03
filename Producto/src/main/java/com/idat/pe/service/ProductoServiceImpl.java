package com.idat.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.model.Producto;
import com.idat.pe.repository.ProductoRepo;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepo repo;
	
	@Override
	public List<Producto> listar() {
		
		return repo.findAll();
	}
	
	

}
