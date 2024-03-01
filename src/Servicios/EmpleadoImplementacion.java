package Servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.VentaDto;

public class EmpleadoImplementacion implements EmpleadoInterfaz {

	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void AñadirVentas(List<VentaDto>listaVenta) {
		// TODO Auto-generated method stub
		
		VentaDto venta = new VentaDto();
		
		int importe;
		
		System.out.println("Introduzca el importe de la venta.");
		importe=sc.nextInt();
		
		LocalDate fechaVenta=LocalDate.now();
		
		long idABuscar=CalcularID(listaVenta);
		
		venta.setFechaVenta(fechaVenta);
		venta.setImporteVenta(importe);
		venta.setIdVenta(idABuscar);
		
		listaVenta.add(venta);
		
		
	}

	

	private long CalcularID(List<VentaDto>listaVenta) {
		
		VentaDto venta = new VentaDto();
		
		long idABuscar;
		int tamanioLista=0;
		
		if(tamanioLista==listaVenta.size()) {
			
			idABuscar=0;
			venta.setIdVenta(idABuscar);
			
		}else {
			
			idABuscar=(venta.getIdVenta()+1);
		}
		
		return idABuscar;
	}
}
