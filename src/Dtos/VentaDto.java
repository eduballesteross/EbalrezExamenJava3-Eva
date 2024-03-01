package Dtos;

import java.time.LocalDate;
import java.util.Date;

public class VentaDto {

	long IdVenta;
	int importeVenta;
	LocalDate fechaVenta;
	
	public long getIdVenta() {
		return IdVenta;
	}
	public void setIdVenta(long idVenta) {
		IdVenta = idVenta;
	}
	public int getImporteVenta() {
		return importeVenta;
	}
	public void setImporteVenta(int importeVenta) {
		this.importeVenta = importeVenta;
	}
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	public VentaDto(long idVenta, int importeVenta, LocalDate fechaVenta) {
		
		IdVenta = idVenta;
		this.importeVenta = importeVenta;
		this.fechaVenta = fechaVenta;
	}
	
	public VentaDto() {}
}
