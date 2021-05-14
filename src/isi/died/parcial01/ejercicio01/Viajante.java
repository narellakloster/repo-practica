package isi.died.parcial01.ejercicio01;

import java.util.List;

public class Viajante extends Empleado {
	
	public List<Venta> ventas;
	public List<Gastos> gastos;

	public double calcularSueldo(List<Venta> venta) {
		double sueldo;
		double totalA=0;
		double totalV=0;
		double gasto=0;
		
		for (Venta v :ventas) {
			if(v.tipoVenta == TipoVta.AGROQUIMICOS) {
				totalA = totalA + 0.15 * v.totalVenta;
			}
			else {
				totalV = totalV + 0.25 * v.totalVenta;
			}
		}
		for (Gastos g :gastos) {
			gasto = gasto + g.totalGasto;
		}
		sueldo = sueldoBasico + totalA + totalV + gasto;
		return sueldo;
	}
	
	
	
	
} 
