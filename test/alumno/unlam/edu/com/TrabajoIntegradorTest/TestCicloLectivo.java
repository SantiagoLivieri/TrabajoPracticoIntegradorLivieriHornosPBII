package alumno.unlam.edu.com.TrabajoIntegradorTest;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import alumno.unlam.edu.com.Dominio.CicloLectivo;

public class TestCicloLectivo {

	@Test
	public void queSePuedaCrearUnCicloLectivo() {
		//Preparacion
		CicloLectivo cicloLectivo;
		
		final LocalDate INICIO_SEG_CUATRIMESTRE = LocalDate.of(2023, 8, 14);
		final LocalDate FINAL_SEG_CUATRIMESTRE = LocalDate.of(2023, 12, 2);
		final LocalDate INCIO_INSCRIPCIONES = LocalDate.of(2023, 7, 31);
		final LocalDate FINAL_INSCRIPCIONES = LocalDate.of(2023, 8, 3);

		
		//Ejecucion
		cicloLectivo = new CicloLectivo (INCIO_INSCRIPCIONES,FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE, FINAL_SEG_CUATRIMESTRE); 
		
		//Validacion
		assertNotNull(cicloLectivo);
	}
	
	@Test
	public void QueElCicloLectivoSeaElMismo() {
		//Preparacion
		CicloLectivo cicloLectivo, cicloLectivo2;
		
		final LocalDate INICIO_SEG_CUATRIMESTRE = LocalDate.of(2023, 8, 14);
		final LocalDate FINAL_SEG_CUATRIMESTRE = LocalDate.of(2023, 12, 2);
		final LocalDate INCIO_INSCRIPCIONES = LocalDate.of(2023, 7, 31);
		final LocalDate FINAL_INSCRIPCIONES = LocalDate.of(2023, 8, 3);

		
		//Ejecucion
		cicloLectivo = new CicloLectivo (INCIO_INSCRIPCIONES,FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE, FINAL_SEG_CUATRIMESTRE);
		cicloLectivo2 = new CicloLectivo (INCIO_INSCRIPCIONES,FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE, FINAL_SEG_CUATRIMESTRE); 
		
		//Validacion
		assertTrue(cicloLectivo.equals(cicloLectivo2));
	}
	
	@Test
	public void NoSeRepitaElMismoCicloLectivo() {
		//Preparacion
		CicloLectivo cicloLectivo, cicloLectivo2, cicloLectivo3, cicloLectivo4;
		
		final LocalDate INICIO_SEG_CUATRIMESTRE = LocalDate.of(2023, 8, 14);
		final LocalDate FINAL_SEG_CUATRIMESTRE = LocalDate.of(2023, 12, 2);
		final LocalDate INCIO_INSCRIPCIONES = LocalDate.of(2023, 7, 31);
		final LocalDate FINAL_INSCRIPCIONES = LocalDate.of(2023, 8, 3);
		
		final LocalDate INICIO_SEG_CUATRIMESTRE_2 = LocalDate.of(2023, 9, 14);
		final LocalDate FINAL_SEG_CUATRIMESTRE_2 = LocalDate.of(2024, 12, 2);
		final LocalDate INICIO_SEG_CUATRIMESTRE_3 = LocalDate.of(2024, 9, 14);
		
		//Ejecucion
		cicloLectivo = new CicloLectivo (INCIO_INSCRIPCIONES,FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE, FINAL_SEG_CUATRIMESTRE);
		cicloLectivo2 = new CicloLectivo (INCIO_INSCRIPCIONES,FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE, FINAL_SEG_CUATRIMESTRE); 
		cicloLectivo3 = new CicloLectivo (INCIO_INSCRIPCIONES,FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE, FINAL_SEG_CUATRIMESTRE_2); 
		cicloLectivo4 = new CicloLectivo (INCIO_INSCRIPCIONES,FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE_3, FINAL_SEG_CUATRIMESTRE_2); 
		
		//Validacion
		assertFalse(cicloLectivo.NoSeRepitanCiclosLectivos(cicloLectivo2.getInicioCuatrimestre(), cicloLectivo2.getFinalCuatrimestre()));
		assertFalse(cicloLectivo.NoSeRepitanCiclosLectivos(cicloLectivo3.getInicioCuatrimestre(), cicloLectivo3.getFinalCuatrimestre()));
		assertTrue(cicloLectivo.NoSeRepitanCiclosLectivos(cicloLectivo4.getInicioCuatrimestre(),  cicloLectivo4.getFinalCuatrimestre()));
	}

}
