package alumno.unlam.edu.com.TrabajoIntegradorTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import alumno.unlam.edu.com.Dominio.Alumno;
import alumno.unlam.edu.com.Dominio.CicloLectivo;
import alumno.unlam.edu.com.Dominio.Comision;
import alumno.unlam.edu.com.Dominio.Materia;
import alumno.unlam.edu.com.Dominio.Profesor;
import alumno.unlam.edu.com.Dominio.RegistroDeNotasDeExamen;

public class TestComision {

	@Test
	public void QueSePuedaCrearUnComision() {
		//Representa grupos de estudiantes que cursarán una materia en un ciclo lectivo específico . Tiene asignados profesores, alumnos, y registros de exámenes.
		
		
		//No se Pueden generar 2 Comisiones para la misma materia, el mismo cicloLectivo y el mismo turno

		//Preparacion
		Profesor profesor;
		CicloLectivo cicloLectivo;
		Alumno alumno, alumno2, alumno3;
		Materia materia;
		Set<Alumno> estudiantes = new HashSet<Alumno>();
		Set<Profesor> profesores = new HashSet<Profesor>();
		Comision comision;
		RegistroDeNotasDeExamen registroExamenes;
		
		
		final Integer COD_MATERIA = 0001;
		final String DESCRIPCION = "Conceptos de Programacion Orientada a Objetos";
		final String MATERIA = "Programacion Basica";
		
		final LocalDate INICIO_SEG_CUATRIMESTRE = LocalDate.of(2023, 8, 14);
		final LocalDate FINAL_SEG_CUATRIMESTRE = LocalDate.of(2023, 12, 2);
		final LocalDate INCIO_INSCRIPCIONES = LocalDate.of(2023, 7, 31);
		final LocalDate FINAL_INSCRIPCIONES = LocalDate.of(2023, 8, 3);
		
		final String FECHA_NACIMIENTO = "22-02-1986";
		final String NOMBRE_APELLIDO = "Enzo Perez";
		final Integer DNI = 30560720;
		
		final String FECHA_NACIMIENTO_2 = "22-02-1986";
		final String NOMBRE_APELLIDO_2 = "Enzo Perez";
		final Integer DNI_2 = 30560722;
		
		final String FECHA_NACIMIENTO_3 = "22-02-1986";
		final String NOMBRE_APELLIDO_3 = "Enzo Perez";
		final Integer DNI_3 = 30560744;
		
		final String FECHA_NACIMIENTO_PROF = "22-02-1986";
		final String NOMBRE_APELLIDO_PROF = "Enzo Perez";
		final String EMAIL_PROF = "E_PEREZ@gmail.com";
		final String TELEFONO_PROF = "1522021986";
		final Integer DNI_PROF = 30560720;
		
		final Integer COD_COMISION = 002;
		final String TURNO = "NOCHE";
		final String DIA = "MIERCOLES";
		
		//Ejecucion
		materia = new Materia (MATERIA, COD_MATERIA, DESCRIPCION); 
		alumno = new Alumno (NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI); 
		alumno2 = new Alumno (NOMBRE_APELLIDO_2, FECHA_NACIMIENTO_2, DNI_2); 
		alumno3 = new Alumno (NOMBRE_APELLIDO_3, FECHA_NACIMIENTO_3, DNI_3); 
		profesor = new Profesor(NOMBRE_APELLIDO_PROF,FECHA_NACIMIENTO_PROF, DNI_PROF, EMAIL_PROF, TELEFONO_PROF);
		cicloLectivo = new CicloLectivo (INCIO_INSCRIPCIONES,FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE, FINAL_SEG_CUATRIMESTRE);
		
		comision = new Comision(COD_COMISION, materia, cicloLectivo,TURNO, DIA);
		
		estudiantes.add(alumno);
		estudiantes.add(alumno2);
		estudiantes.add(alumno3);
		profesores.add(profesor);
		
		//Validacion
	}

}
