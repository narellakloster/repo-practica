package isi.died.parcial01.ejercicio02.app;

import java.lang.management.ManagementPermission;
import java.util.List;

import isi.died.parcial01.ejercicio02.dominio.*;



public interface MySysAcad {
	
	public List<Inscripcion> inscripciones;
	
	public void registrarMateria(Materia d);
	
	
	public void registrarDocente(Docente d) ;
	
	
	public void registrarAlumnos(Alumno d);
	/**
	 * crea una nueva instancia de Inscripcion y 
	 * asigna la inscripcion a la lista de inscripciones del alumno, 
	 * de la materia y del docente
	 */
	public void inscribirAlumnoCursada(Docente d,Alumno a, Materia m,Integer cicloLectivo);

	/**
	 * crea una nueva instancia de Inscripcion y 
	 * asigna la inscripcion a la lista de inscripciones del alumno, 
	 * de la materia y del docente
	 */
	public void inscribirAlumnoExamen(Docente d,Alumno a, Materia m);
	
	//PUNTO 3-2
	public abstract double promedio (Integer cicloLectivo , Materia m) {
		List<Examenes> examenes;
		int notas;
		int i=0;
		double promedio=0.0;
		
		for(Inscripcion i: inscripciones) {
			if(i.getMateria()==m && i.getCicloLectivo()==cicloLectivo) {
				examenes.add(m.getExamenes());
				for(Examen e: examenes) {
					notas += e.getNota();
					i++;
				}
				promedio= notas / i;
			}
		}
		
	}
	

}
