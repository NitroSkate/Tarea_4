package com.tarea4.tarea4.domain;

import javax.validation.constraints.Size;

public class Product {
	
	@Size(min=1,max=10)
	String codigo;
	@Size(min=1,max=10)
	String nombrep;
	@Size(min=1,max=10)
	String marca;
	@Size(min=1,max=10)
	String descrip;
	@Size(min=1,max=10)
	String exis;
	@Size(min=1,max=10)
	String fechai;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombrep() {
		return nombrep;
	}
	public void setNombrep(String nombrep) {
		this.nombrep = nombrep;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getExis() {
		return exis;
	}
	public void setExis(String exis) {
		this.exis = exis;
	}
	public String getFechai() {
		return fechai;
	}
	public void setFechai(String fechai) {
		this.fechai = fechai;
	}
	
	

}
