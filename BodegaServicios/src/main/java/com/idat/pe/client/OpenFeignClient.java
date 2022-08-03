package com.idat.pe.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.pe.dto.Producto;

@FeignClient(name="idat-producto", url="localhost:8090")
public interface OpenFeignClient {
	
	@GetMapping("/api/producto/v1/listar")
	public List<Producto> listarProductoaSeleccionados();

}
