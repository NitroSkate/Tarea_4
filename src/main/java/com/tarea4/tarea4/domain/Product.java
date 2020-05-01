package com.tarea4.tarea4.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
	
	@Size(min=12,max=12, message= "Introduzca los 12 digitos del codigo de producto")
	@Digits(integer=12, fraction=0, message= "Numeros enteros solamente")
	String codigo;
	@Size(min=1,max=100, message= "Introduzca entre 1 y 100 caracteres en el Nombre de Producto")
	String nombrep;
	@Size(min=1,max=100, message= "Introduzca entre 1 y 100 caracteres en la Marca")
	String marca;
	@Size(min=1,max=500, message= "Introduzca entre 1 y 500 caracteres en la descripcion del producto")
	String descrip;
	@Digits(integer=10, fraction=0, message= "Numeros enteros solamente")
	String exis;
	@Pattern(regexp="^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$")
	String fechai;
	
	public Product() {
		
	}
	
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
