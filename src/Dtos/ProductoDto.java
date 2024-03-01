package Dtos;

import java.time.LocalDate;

public class ProductoDto {

	
	public long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public LocalDate getFechaDeseadaEntrega() {
		return fechaDeseadaEntrega;
	}
	public void setFechaDeseadaEntrega(LocalDate fechaDeseadaEntrega) {
		this.fechaDeseadaEntrega = fechaDeseadaEntrega;
	}
	
	
	public ProductoDto(long idProducto, String nombreProducto, int cantidadProducto, LocalDate fechaDeseadaEntrega) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.cantidadProducto = cantidadProducto;
		this.fechaDeseadaEntrega = fechaDeseadaEntrega;
	}
	
	public ProductoDto() {}
	
	long idProducto;
	String nombreProducto;
	int cantidadProducto;
	LocalDate fechaDeseadaEntrega;
}
