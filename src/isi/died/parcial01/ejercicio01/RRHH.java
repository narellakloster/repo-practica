package isi.died.parcial01.ejercicio01;

import java.util.List;

public class RRHH {

	
	private List<ReciboSueldo> recibos;

	public List<ReciboSueldo> devolver (List<Empleado> empleados){
		
		recibos = null;
		
		for (Empleado e: empleados) {
			recibos.add(e.recibo);	
		}
		
		return recibos;
	
	}

}
