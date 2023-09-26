package alumno.unlam.edu.com.TrabajoIntegradorTest;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import alumno.unlam.edu.com.Dominio.Alumno;
import alumno.unlam.edu.com.Dominio.Aula;
import alumno.unlam.edu.com.Dominio.CicloLectivo;
import alumno.unlam.edu.com.Dominio.Comision;
import alumno.unlam.edu.com.Dominio.Materia;
import alumno.unlam.edu.com.Dominio.Universidad;

public class UniversidadTest {

	@Test
	public void queSePuedaCrearUnaUniversidad() {
		//Preparacion
		Universidad universidad;
		final String nombre = "Unlam";
		
		//Ejecucion
		universidad = new Universidad(nombre);
		
		//Validacion
		assertNotNull(universidad);
	}
	
	@Test
	public void queSePuedaInscribirAlumnoAComision() {
		//Preparacion
		Universidad universidad;
		Alumno alumno;
		Comision comision;
		CicloLectivo cicloLectivo;
		Materia materia;
		Aula aula;
		
		final Integer CANTIDAD_ALUMNOS_ESPERADOS = 1;
		
		final String NOMBRE_UNI = "Unlam";
		final LocalDate FECHA = LocalDate.of(2023, 8, 1);
		
		final String FECHA_NACIMIENTO = "17-05-1990";
		final String NOMBRE_APELLIDO = "Dario Benedetto";
		final Integer DNI = 34956747;
		
		final LocalDate INICIO_SEG_CUATRIMESTRE = LocalDate.of(2023, 8, 14);
		final LocalDate FINAL_SEG_CUATRIMESTRE = LocalDate.of(2023, 12, 2);
		final LocalDate INCIO_INSCRIPCIONES = LocalDate.of(2023, 7, 31);
		final LocalDate FINAL_INSCRIPCIONES = LocalDate.of(2023, 8, 3);
		
		final Integer COD_COMISION = 002;
		final String TURNO = "NOCHE";
		final String DIA = "MIERCOLES";
		
		final Integer COD_MATERIA = 0001;
		final String DESCRIPCION = "Programacion Basica";
		final String MATERIA = "Programacion Basica";
		
		final Integer ID_AULA = 1;
		//Ejecucion
		universidad = new Universidad(NOMBRE_UNI);
		
		alumno = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI);
		
		cicloLectivo = new CicloLectivo(INCIO_INSCRIPCIONES, FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE,
				FINAL_SEG_CUATRIMESTRE);
		
		materia = new Materia(MATERIA, COD_MATERIA, DESCRIPCION);

		comision = new Comision(COD_COMISION, materia, cicloLectivo, TURNO, DIA);

		aula = new Aula(ID_AULA);

		comision.setAula(aula);
		
		universidad.agregarAula(aula);
		universidad.agregarComision(comision);
		universidad.agregarMateria(materia);
		universidad.agregarAlumno(alumno);
		
		
		universidad.inscribirAlumnoAComision(DNI, COD_COMISION, FECHA);
		
		Integer alumnosAnotados = comision.getAlumnos().size();
		
		//Validacion
		assertEquals(CANTIDAD_ALUMNOS_ESPERADOS, alumnosAnotados);
	}
}
