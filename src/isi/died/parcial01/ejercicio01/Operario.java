package isi.died.parcial01.ejercicio01;

import java.util.Date;
import java.util.List;

public class Operario extends Empleado {
	
	public double sueldo;
	public List<Viajante> viajantes;
	
	public double calcularSueldo() {
		Date fechaActual = new Date();
		double totalVentas;
		for(Venta v: viajantes) {
			totalVentas += v.totalVenta;
		}
		sueldo= (totalVentas * 0.2) + sueldoBasico;
		if((fechaIngreso.getDay() == fechaActual.getDay()) && fechaIngreso.getMonth() == fechaActual.getMonth()) {
			sueldo = sueldo + sueldo*0.5;
		}
		return sueldo;
	}
	
	

}
