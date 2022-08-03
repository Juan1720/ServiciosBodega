package com.idat.pe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer idProducto;
	private String nombre;
	
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Producto(Integer idProducto, String nombre) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
