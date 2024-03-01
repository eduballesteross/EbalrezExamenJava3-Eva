package Servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import Dtos.ProductoDto;
import Dtos.VentaDto;

public class GerenteImplementacion implements GerenteInterfaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public void MostrarVentas(List<VentaDto> listaVenta) {
		// TODO Auto-generated method stub

		System.out.println("Has seleccionado la opcion mostrar ventas del dia");

		System.out.println("Introduzca la fecha del dia deseado en formato dd-MM-yyyy");
		String fecha = sc.next();

	}

	@Override
	public void CrearPedidos(List<ProductoDto> listaProductos) {
		// TODO Auto-generated method stub

		ProductoDto producto = new ProductoDto();

		boolean cerrarBucle = false;

		while (!cerrarBucle) {
			
			long idProducto=CalcularID(listaProductos);
			System.out.println("Introduzca la cantidad de los productos para el pedido.");
			int cantidad = sc.nextInt();

			System.out.println("Introduzca el nombre del producto.");
			String nombreProducto = sc.next();

			LocalDate fechaEntregaDeseada = LocalDate.now();
			
			producto.setIdProducto(idProducto);
			producto.setNombreProducto(nombreProducto);
			producto.setCantidadProducto(cantidad);
			producto.setFechaDeseadaEntrega(fechaEntregaDeseada);
			
			System.out.println("¿Desea añadir otro producto? Si/No");
			String respuesta = sc.next();

			if (respuesta == "Si") {
				cerrarBucle = true;
			} else {
				cerrarBucle = false;
			}
		}

	}

	private long CalcularID(List<ProductoDto> listaProducto) {

		ProductoDto producto = new ProductoDto();

		long idABuscar;
		int tamanioLista = 0;

		if (tamanioLista == listaProducto.size()) {

			idABuscar = 0;
			producto.setIdProducto(idABuscar);

		} else {

			idABuscar = (producto.getIdProducto()+1);
		}

		return idABuscar;
	}

}
