package com.idat.pe.model;

import java.io.Serializable;

import javax.persistence.Column;

public class BodegaDetalleFK  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6286723600546940035L;

	
	@Column(name="id_bodega", nullable = false, unique = true)
	private Integer idBodega;
	
	@Column(name="id_producto", nullable = false, unique = true)
	private Integer idProducto;

	public Integer getIdBodega() {
		return idBodega;
	}

	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

}
