package Controladores;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		MenuInterfaz menuI= new MenuImplementacion();
		
		int opcion;
		boolean cerrarMenu=false;
		
		while(!cerrarMenu) {
			
			opcion=menuI.MostrarMenuPrincipal();
			
			switch(opcion) {
			
			case 0:
				System.out.println("Has seleccionado la opcion de cerrar menu.");
				cerrarMenu=true;
				break;
			
			case 1:
				menuI.MostrarMenuEmpleado();
				break;
			
			case 2: 
				menuI.MostrarMenuGerente();
				break;
				
			default:
				System.out.println("Has seleccionado una opcion no disponible.");
				break;
			}
			
		}
	}

}
