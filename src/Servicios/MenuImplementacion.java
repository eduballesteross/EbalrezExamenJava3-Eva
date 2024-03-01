package Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.ProductoDto;
import Dtos.VentaDto;

/**
 * Implementación a Menu Interfaz EBP-01-03-2S4
 */
public class MenuImplementacion implements MenuInterfaz {
	
	
	Scanner sc = new Scanner(System.in);
	EmpleadoInterfaz empleadoI = new EmpleadoImplementacion();
	GerenteInterfaz gerenteI = new GerenteImplementacion();
	List<VentaDto> listaVenta = new ArrayList<>();
	List<ProductoDto>listaProducto = new ArrayList<>();

	@Override
	public int MostrarMenuPrincipal() {
		// TODO Auto-generated method stub

		int opcion;

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("0- Cerrar Menu");
		System.out.println("1- Menu Empleado");
		System.out.println("2- Menu Gerencia");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
		opcion = sc.nextInt();

		return opcion;

	}

	@Override
	public void MostrarMenuEmpleado(){
		// TODO Auto-generated method stub
		int opcion;
		boolean cerrarMenu = false;

		while (!cerrarMenu) {

			opcion = MostrarMenuEmpleado1();

			switch (opcion) {

			case 0:
				System.out.println("Has seleccionado la opcion de volver al menu principal.");
				cerrarMenu = true;
				break;

			case 1:
				empleadoI.AñadirVentas(listaVenta);
				break;

			case 2:
			
				break;

			default:
				System.out.println("Has seleccionado una opcion no disponible.");
				break;
			}

		}
		

	}
	
	@Override
	public void MostrarMenuGerente() {
		// TODO Auto-generated method stub
		int opcion;
		boolean cerrarMenu = false;

		while (!cerrarMenu) {

			opcion = MostrarMenuGerente1();

			switch (opcion) {

			case 0:
				System.out.println("Has seleccionado la opcion de volver al menu principal.");
				cerrarMenu = true;
				break;

			case 1:
				
				break;

			case 2:
				System.out.println("Has seleccionado la opcion de hacer pedido para proveedores.");
				gerenteI.CrearPedidos(listaProducto);
				break;

			default:
				System.out.println("Has seleccionado una opcion no disponible.");
				break;
			}

		}
		
	}
	

	private int MostrarMenuEmpleado1() {
		// TODO Auto-generated method stub
		int opcion;

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("0- Menu Principal");
		System.out.println("1- Añadir Ventas");
		System.out.println("2- Calculo total de ventas diario");
		System.out.println("3- Mostrar Ventas");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
		opcion = sc.nextInt();

		return opcion;
	}
	
	private int MostrarMenuGerente1() {
		// TODO Auto-generated method stub
		int opcion;

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("0- Menu Principal");
		System.out.println("1- Añadir Ventas");
		System.out.println("2- Calculo total de ventas diario");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
		opcion = sc.nextInt();

		return opcion;
	}

	
}

	

	

	

