package Servicios;

import java.util.List;

import Dtos.ProductoDto;
import Dtos.VentaDto;
/**
 * Listado de métodos del MenuGerente
 * EBP-010324
 */
public interface GerenteInterfaz {

	/**
	 * Metodo que muestra las ventas
	 * @param listaVenta
	 */
	public void MostrarVentas(List<VentaDto>listaVenta);
	
	/**
	 * Método que permite crear pedidos
	 * @param listaProductos
	 */
	public void CrearPedidos(List<ProductoDto>listaProductos);
	
}
