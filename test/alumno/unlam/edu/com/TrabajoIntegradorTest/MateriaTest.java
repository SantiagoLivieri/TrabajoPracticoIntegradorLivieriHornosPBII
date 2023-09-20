package alumno.unlam.edu.com.TrabajoIntegradorTest;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import alumno.unlam.edu.com.Dominio.Materia;

public class MateriaTest {

	@Test
	public void queSePuedaCrearUnaMateria() {
		//Preparacion
		Materia materia1;
		final Integer COD_MATERIA_ESPERADO = 0001;
		
		final Integer COD_MATERIA = 0001;
		final String DESCRIPCION = "Programacion Basica";
		final String MATERIA = "Programacion Basica";
		
		//Ejecucion
		materia1 = new Materia (MATERIA, COD_MATERIA, DESCRIPCION); 
		
		//Validacion
		assertEquals(COD_MATERIA_ESPERADO, materia1.getCodigoMateria());
	}
	
	@Test
	public void queLasMateriasTenganMismoID() {
		//Preparacion
		Materia materia1, materia2;
		
		final Integer COD_MATERIA = 0001;
		final Integer COD_MATERIA_1 = 0001;
		final String DESCRIPCION = "Programacion Basica";
		final String MATERIA = "Programacion Basica";
		
		//Ejecucion
		materia1 = new Materia (MATERIA, COD_MATERIA, DESCRIPCION); 
		materia2 = new Materia (MATERIA, COD_MATERIA_1, DESCRIPCION); 
		
		//Validacion
		assertTrue(materia1.equals(materia2));
	}
	
	@Test
	public void QueLasMateriasEstenEnUnPlanDeEstudio() {
		//Preparacion
		Materia materia1, materia2;
		Set<Materia> tecnicaturaWeb = new HashSet<Materia>();
		
		final Integer CANTIDAD_MATERIAS_ESPERADAS = 1;
		
		final Integer COD_MATERIA = 0001;
		final Integer COD_MATERIA_1 = 0001;
		final String DESCRIPCION = "Programacion Basica";
		final String MATERIA = "Programacion Basica";
		
		//Ejecucion
		materia1 = new Materia (MATERIA, COD_MATERIA, DESCRIPCION); 
		materia2 = new Materia (MATERIA, COD_MATERIA_1, DESCRIPCION); 
		
		tecnicaturaWeb.add(materia2);
		tecnicaturaWeb.add(materia1);
		
		//Validacion
		assertEquals(CANTIDAD_MATERIAS_ESPERADAS, (Integer)tecnicaturaWeb.size());
	}
}
