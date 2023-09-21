package alumno.unlam.edu.com.TrabajoIntegradorTest;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

import alumno.unlam.edu.com.Dominio.Alumno;


public class AlumnoTest {

	@Test
	public void queSePuedaCrearUnAlumno() {
		//Preparacion
		Alumno alumno;
		final Integer DNI_ESPERADO = 30560720;
		
		final String FECHA_NACIMIENTO = "22-02-1986";
		final String NOMBRE_APELLIDO = "Enzo Perez";
		final Integer DNI = 30560720;
		
		//Ejecucion
		alumno = new Alumno (NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI); 
		
		//Validacion
		assertEquals(DNI_ESPERADO, DNI);
	}
	
	@Test
	public void queElAlumnoTengaMismoDNI() {
		//Preparacion
		Alumno alumno1, alumno2;
		final Integer DNI_ESPERADO = 30560720;
		
		final String FECHA_NACIMIENTO = "22-02-1986";
		final String NOMBRE_APELLIDO = "Enzo Perez";
		final Integer DNI = 30560720;
		
		//Ejecucion
		alumno1 = new Alumno (NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI); 
		alumno2 = new Alumno (NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI); 
		
		//Validacion
		assertTrue(alumno1.equals(alumno2));
	}
	
	@Test
	public void QueNoSePuedanAgregarDosALumnosConMismoDNI() {
		//Preparacion
		Alumno alumno1, alumno2;
		Set<Alumno> Alumnos = new HashSet<Alumno>();
		
		final Integer CANTIDAD_ALUMNOS_ESPERADAS = 1;
		
		final String FECHA_NACIMIENTO = "22-02-1986";
		final String NOMBRE_APELLIDO = "Enzo Perez";
		final Integer DNI = 30560720;
		
		//Ejecucion
		alumno1 = new Alumno (NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI); 
		alumno2 = new Alumno (NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI); 
		
		Alumnos.add(alumno1);
		Alumnos.add(alumno2);
		
		//Validacion
		assertEquals(CANTIDAD_ALUMNOS_ESPERADAS, (Integer)Alumnos.size());
	}

}
