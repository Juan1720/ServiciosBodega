package com.idat.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.client.OpenFeignClient;
import com.idat.pe.dto.Producto;
import com.idat.pe.model.Bodega;
import com.idat.pe.model.BodegaDetalle;
import com.idat.pe.model.BodegaDetalleFK;
import com.idat.pe.repository.BodegaRepo;
import com.idat.pe.repository.BodegaRepository;
@Service
public class BodegaServiceImpl implements BodegaService{


	@Autowired
	private BodegaRepo repo;
	
	@Autowired
	private BodegaRepository boddegaDetalle;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public List<Bodega> listar() {
		
		return repo.findAll();
	}
	
	@Override
	public void asignarBodegaProducto() {
		
		List<Producto> listado = feign.listarProductoaSeleccionados();;
		BodegaDetalleFK fk = null;
		BodegaDetalle detalle = null;
		for (Producto producto : listado) {
			
			fk = new BodegaDetalleFK();
			
			fk.setIdProducto(producto.getIdProducto());
			fk.setIdBodega(1);
			
			detalle = new BodegaDetalle();
			detalle.setFk(fk);
		}
		
		
		boddegaDetalle.save(detalle);
		
	}

}
