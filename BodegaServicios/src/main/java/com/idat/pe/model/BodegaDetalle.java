package com.idat.pe.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bodega_detalle")
public class BodegaDetalle {
	
	@Id
	private BodegaDetalleFK fk =new BodegaDetalleFK();

	public BodegaDetalleFK getFk() {
		return fk;
	}

	public void setFk(BodegaDetalleFK fk) {
		this.fk = fk;
	}

	
	

}
