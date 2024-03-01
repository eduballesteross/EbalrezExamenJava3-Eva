package Servicios;

import java.util.List;

import Dtos.VentaDto;
/**
 * Listado de métodos de la funcion empleado
 * EBP-010324
 */
public interface EmpleadoInterfaz {

	/**
	 * Método que permite añadir venta
	 * EBP-010324
	 * @param listaVentas
	 */
	public void AñadirVentas(List<VentaDto>listaVentas);
	
}
