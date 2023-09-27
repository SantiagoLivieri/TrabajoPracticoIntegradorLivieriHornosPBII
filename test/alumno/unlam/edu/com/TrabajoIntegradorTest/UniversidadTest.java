package alumno.unlam.edu.com.TrabajoIntegradorTest;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import alumno.unlam.edu.com.Dominio.Alumno;
import alumno.unlam.edu.com.Dominio.Aula;
import alumno.unlam.edu.com.Dominio.CicloLectivo;
import alumno.unlam.edu.com.Dominio.Comision;
import alumno.unlam.edu.com.Dominio.Materia;
import alumno.unlam.edu.com.Dominio.Nota;
import alumno.unlam.edu.com.Dominio.Profesor;
import alumno.unlam.edu.com.Dominio.TipoNota;
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
	
	@Test
	public void QueSePuedaObtenerLasMateriasFaltantesDeUnAlumno() {
		// Preparacion
		Comision comision;
		Materia materia, materia2, materia3;
		CicloLectivo cicloLectivo;
		Aula aula;
		Alumno alumno;
		Universidad universidad;
		Nota nota;
		
		final Integer MATERIAS_FALTANTES_ESPERADA = 2;
		
		final String NOMBRE_UNI = "Unlam";

		final Integer COD_COMISION = 002;
		final String TURNO = "NOCHE";
		final String DIA = "MIERCOLES";

		final Integer COD_MATERIA = 0001;
		final String DESCRIPCION = "Programacion Basica";
		final String MATERIA = "Programacion Basica";
		
		final Integer COD_MATERIA_2 = 0002;
		final String DESCRIPCION_2 = "Programacion Basica 2";
		final String MATERIA_2 = "Programacion Basica 2";
		
		final Integer COD_MATERIA_3 = 0003;
		final String DESCRIPCION_3 = "Programacion Basica 3";
		final String MATERIA_3 = "Programacion Basica 3";

		final Integer ID_AULA = 1;

		final LocalDate INICIO_SEG_CUATRIMESTRE = LocalDate.of(2023, 8, 14);
		final LocalDate FINAL_SEG_CUATRIMESTRE = LocalDate.of(2023, 12, 2);
		final LocalDate INCIO_INSCRIPCIONES = LocalDate.of(2023, 7, 31);
		final LocalDate FINAL_INSCRIPCIONES = LocalDate.of(2023, 8, 3);



		final String FECHA_NACIMIENTO = "22-02-1986";
		final String NOMBRE_APELLIDO = "Enzo Perez";
		final Integer DNI = 30560720;
		
		final TipoNota tipo = TipoNota.Promocionado;
		final Integer valor = 7;

		// Ejecucion
		universidad = new Universidad(NOMBRE_UNI);

		cicloLectivo = new CicloLectivo(INCIO_INSCRIPCIONES, FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE,
				FINAL_SEG_CUATRIMESTRE);

		materia = new Materia(MATERIA, COD_MATERIA, DESCRIPCION);
		materia2 = new Materia(MATERIA_2, COD_MATERIA_2, DESCRIPCION_2);
		materia3 = new Materia(MATERIA_3, COD_MATERIA_3, DESCRIPCION_3);

		comision = new Comision(COD_COMISION, materia, cicloLectivo, TURNO, DIA);

		alumno = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI);

		aula = new Aula(ID_AULA);
		
		nota = new Nota(tipo,valor);
		
		universidad.agregarAlumno(alumno);
		
		universidad.agregarMateria(materia);
		universidad.agregarMateria(materia2);
		universidad.agregarMateria(materia3);
		universidad.agregarAula(aula);
		alumno.agregarMateriaAprobada(materia);
		
		comision.setMateria(materia);

		comision.agregarAlumno(alumno);

		universidad.agregarComision(comision);
		
		comision.agregarRegistro(DNI, nota);
		
		Integer materiasFaltantes = universidad.obtenerMateriasFaltantesAlumno(DNI).size();
		
		
		// Validacion
		assertEquals(MATERIAS_FALTANTES_ESPERADA, materiasFaltantes);
	}
	
}
