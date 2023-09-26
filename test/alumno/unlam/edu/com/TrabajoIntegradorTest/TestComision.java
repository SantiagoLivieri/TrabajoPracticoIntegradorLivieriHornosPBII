package alumno.unlam.edu.com.TrabajoIntegradorTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import alumno.unlam.edu.com.Dominio.Alumno;
import alumno.unlam.edu.com.Dominio.Aula;
import alumno.unlam.edu.com.Dominio.CicloLectivo;
import alumno.unlam.edu.com.Dominio.Comision;
import alumno.unlam.edu.com.Dominio.Materia;
import alumno.unlam.edu.com.Dominio.Profesor;
import alumno.unlam.edu.com.Dominio.RegistroDeNotasDeExamen;
import alumno.unlam.edu.com.Dominio.Universidad;

public class TestComision {

	@Test
	public void QueSePuedaCrearUnComision() {
		// Representa grupos de estudiantes que cursarán una materia en un ciclo lectivo
		// específico . Tiene asignados profesores, alumnos, y registros de exámenes.

		// No se Pueden generar 2 Comisiones para la misma materia, el mismo
		// cicloLectivo y el mismo turno

		// Preparacion
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

		// Ejecucion
		materia = new Materia(MATERIA, COD_MATERIA, DESCRIPCION);
		alumno = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI);
		alumno2 = new Alumno(NOMBRE_APELLIDO_2, FECHA_NACIMIENTO_2, DNI_2);
		alumno3 = new Alumno(NOMBRE_APELLIDO_3, FECHA_NACIMIENTO_3, DNI_3);
		profesor = new Profesor(NOMBRE_APELLIDO_PROF, FECHA_NACIMIENTO_PROF, DNI_PROF, EMAIL_PROF, TELEFONO_PROF);
		cicloLectivo = new CicloLectivo(INCIO_INSCRIPCIONES, FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE,
				FINAL_SEG_CUATRIMESTRE);

		comision = new Comision(COD_COMISION, materia, cicloLectivo, TURNO, DIA);

		estudiantes.add(alumno);
		estudiantes.add(alumno2);
		estudiantes.add(alumno3);
		profesores.add(profesor);

		// Validacion
	}

	@Test
	public void QueSeAsigne2ProfesorALaComisionAlPasarLos20Alumnos() {
		// Preparacion
		Universidad universidad;
		Comision comision;
		Materia materia;
		CicloLectivo cicloLectivo;
		Aula aula;
		Profesor profesor, profesor2;
		Alumno alumno, alumno2, alumno3, alumno4, alumno5, alumno6, alumno7, alumno8, alumno9, alumno10, alumno11,
				alumno12, alumno13, alumno14, alumno15, alumno16, alumno17, alumno18, alumno19, alumno20, alumno21;

		final Integer PROFESORES_ESPERADOS = 2;

		final String NOMBRE_UNI = "Unlam";

		final Integer COD_COMISION = 002;
		final String TURNO = "NOCHE";
		final String DIA = "MIERCOLES";

		final Integer COD_MATERIA = 0001;
		final String DESCRIPCION = "Programacion Basica";
		final String MATERIA = "Programacion Basica";

		final Integer ID_AULA = 1;

		final LocalDate INICIO_SEG_CUATRIMESTRE = LocalDate.of(2023, 8, 14);
		final LocalDate FINAL_SEG_CUATRIMESTRE = LocalDate.of(2023, 12, 2);
		final LocalDate INCIO_INSCRIPCIONES = LocalDate.of(2023, 7, 31);
		final LocalDate FINAL_INSCRIPCIONES = LocalDate.of(2023, 8, 3);

		final String FECHA_NACIMIENTO_PROF = "22-02-1986";
		final String NOMBRE_APELLIDO_PROF = "Enzo Perez";
		final String EMAIL_PROF = "E_PEREZ@gmail.com";
		final String TELEFONO_PROF = "1522021986";
		final Integer DNI_PROF = 30560721;

		final Integer DNI_PROF2 = 12231;

		final String FECHA_NACIMIENTO = "22-02-1986";
		final String NOMBRE_APELLIDO = "Enzo Perez";
		final Integer DNI = 30560720;

		final Integer DNI1 = 1;
		final Integer DNI2 = 2;
		final Integer DNI3 = 3;
		final Integer DNI4 = 4;
		final Integer DNI5 = 5;
		final Integer DNI6 = 6;
		final Integer DNI7 = 7;
		final Integer DNI8 = 8;
		final Integer DNI9 = 9;
		final Integer DNI10 = 10;
		final Integer DNI11 = 11;
		final Integer DNI12 = 12;
		final Integer DNI13 = 13;
		final Integer DNI14 = 14;
		final Integer DNI15 = 15;
		final Integer DNI16 = 16;
		final Integer DNI17 = 17;
		final Integer DNI18 = 18;
		final Integer DNI19 = 19;
		final Integer DNI20 = 20;
		// Ejecucion
		universidad = new Universidad(NOMBRE_UNI);

		cicloLectivo = new CicloLectivo(INCIO_INSCRIPCIONES, FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE,
				FINAL_SEG_CUATRIMESTRE);

		materia = new Materia(MATERIA, COD_MATERIA, DESCRIPCION);

		comision = new Comision(COD_COMISION, materia, cicloLectivo, TURNO, DIA);

		profesor = new Profesor(NOMBRE_APELLIDO_PROF, FECHA_NACIMIENTO_PROF, DNI_PROF, EMAIL_PROF, TELEFONO_PROF);
		profesor2 = new Profesor(NOMBRE_APELLIDO_PROF, FECHA_NACIMIENTO_PROF, DNI_PROF2, EMAIL_PROF, TELEFONO_PROF);

		alumno = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI);
		alumno2 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI1);
		alumno3 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI2);
		alumno4 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI3);
		alumno5 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI4);
		alumno6 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI5);
		alumno7 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI6);
		alumno8 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI7);
		alumno9 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI8);
		alumno10 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI9);
		alumno11 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI10);
		alumno12 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI11);
		alumno13 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI12);
		alumno14 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI13);
		alumno15 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI14);
		alumno16 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI15);
		alumno17 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI16);
		alumno18 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI17);
		alumno19 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI18);
		alumno20 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI19);
		alumno21 = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI20);

		aula = new Aula(ID_AULA);

		comision.setAula(aula);
		comision.agregarAlumno(alumno);
		comision.agregarAlumno(alumno2);
		comision.agregarAlumno(alumno3);
		comision.agregarAlumno(alumno4);
		comision.agregarAlumno(alumno5);
		comision.agregarAlumno(alumno6);
		comision.agregarAlumno(alumno7);
		comision.agregarAlumno(alumno8);
		comision.agregarAlumno(alumno9);
		comision.agregarAlumno(alumno10);
		comision.agregarAlumno(alumno11);
		comision.agregarAlumno(alumno12);
		comision.agregarAlumno(alumno13);
		comision.agregarAlumno(alumno14);
		comision.agregarAlumno(alumno15);
		comision.agregarAlumno(alumno16);
		comision.agregarAlumno(alumno17);
		comision.agregarAlumno(alumno18);
		comision.agregarAlumno(alumno19);
		comision.agregarAlumno(alumno20);
		comision.agregarAlumno(alumno21);

		universidad.agregarComision(comision);

		universidad.agregarProfesor(profesor);
		universidad.agregarProfesor(profesor2);

		universidad.asignarProfesorALaComision(COD_COMISION, DNI_PROF);
		universidad.asignarProfesorALaComision(COD_COMISION, DNI_PROF2);

		Integer cantidadProfesores = comision.getProfesores().size();

		// Validacion
		assertEquals(PROFESORES_ESPERADOS, cantidadProfesores);
	}

	@Test
	public void QueSePuedaAsignarAulaAComision() {
		// Preparacion
		Comision comision;
		Materia materia;
		CicloLectivo cicloLectivo;
		Aula aula;
		Profesor profesor;
		Alumno alumno;
		Universidad universidad;

		final String NOMBRE_UNI = "Unlam";

		final Integer COD_COMISION = 002;
		final String TURNO = "NOCHE";
		final String DIA = "MIERCOLES";

		final Integer COD_MATERIA = 0001;
		final String DESCRIPCION = "Programacion Basica";
		final String MATERIA = "Programacion Basica";

		final Integer ID_AULA = 1;

		final LocalDate INICIO_SEG_CUATRIMESTRE = LocalDate.of(2023, 8, 14);
		final LocalDate FINAL_SEG_CUATRIMESTRE = LocalDate.of(2023, 12, 2);
		final LocalDate INCIO_INSCRIPCIONES = LocalDate.of(2023, 7, 31);
		final LocalDate FINAL_INSCRIPCIONES = LocalDate.of(2023, 8, 3);

		final String FECHA_NACIMIENTO_PROF = "22-02-1986";
		final String NOMBRE_APELLIDO_PROF = "Enzo Perez";
		final String EMAIL_PROF = "E_PEREZ@gmail.com";
		final String TELEFONO_PROF = "1522021986";
		final Integer DNI_PROF = 30560721;

		final String FECHA_NACIMIENTO = "22-02-1986";
		final String NOMBRE_APELLIDO = "Enzo Perez";
		final Integer DNI = 30560720;

		// Ejecucion
		universidad = new Universidad(NOMBRE_UNI);

		cicloLectivo = new CicloLectivo(INCIO_INSCRIPCIONES, FINAL_INSCRIPCIONES, INICIO_SEG_CUATRIMESTRE,
				FINAL_SEG_CUATRIMESTRE);

		materia = new Materia(MATERIA, COD_MATERIA, DESCRIPCION);

		comision = new Comision(COD_COMISION, materia, cicloLectivo, TURNO, DIA);

		profesor = new Profesor(NOMBRE_APELLIDO_PROF, FECHA_NACIMIENTO_PROF, DNI_PROF, EMAIL_PROF, TELEFONO_PROF);

		alumno = new Alumno(NOMBRE_APELLIDO, FECHA_NACIMIENTO, DNI);

		aula = new Aula(ID_AULA);

		comision.agregarAlumno(alumno);

		universidad.agregarComision(comision);

		universidad.agregarProfesor(profesor);
		universidad.asignarProfesorALaComision(COD_COMISION, DNI_PROF);

		universidad.agregarAula(aula);
		universidad.asignarAulaALaComision(COD_COMISION, DNI_PROF, aula);
		// Validacion
		assertNotNull(comision.getAula());
	}
}
