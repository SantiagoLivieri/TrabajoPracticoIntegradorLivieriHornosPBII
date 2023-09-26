package alumno.unlam.edu.com.Dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Universidad {
	private String nombre;
	private List<Materia> materias;
	private Set<Alumno> alumnos;
	private Set<Profesor> profesores;
	private Set<CicloLectivo> ciclosLectivos;
	private Set<Comision> comision;
	private Set<Aula> aulas;

	public Universidad(String nombre) {
		this.nombre = nombre;
		materias = new ArrayList<>();
		alumnos = new HashSet<>();
		profesores = new HashSet<>();
		ciclosLectivos = new HashSet<>();
		comision = new HashSet<>();
		aulas = new HashSet<>();
	}

	public boolean registrarNota(Integer idComision, Integer dniAlumno, Nota nota) {
		Comision comision = buscarComisionPorId(idComision);
		Alumno alumno = buscarAlumnoPorDni(dniAlumno);

		return false;
	}

	public List<Materia> obtenerMateriasAprobadasParaUnAlumno(Integer dniAlumno) {

		Alumno alumno = buscarAlumnoPorDni(dniAlumno);

		return alumno.getMateriasAprobadas();
	}

	public boolean asignarAulaALaComision(Integer idComision, Integer dniDocente, Aula Aula) {
		Comision comision = buscarComisionPorId(idComision);
		Profesor profe = buscarProfesorPorDni(dniDocente);

		if (comision != null && profe != null) {
			comision.setAula(Aula);
			return true;
		}
		return false;
	}

	public boolean asignarProfesorALaComision(Integer idComision, Integer dniDocente) {
		Comision comision = buscarComisionPorId(idComision);
		Profesor profe = buscarProfesorPorDni(dniDocente);

		if (comision != null && profe != null) {
			comision.setProfesores(profe);
			return true;
		}
		return false;
	}

	public boolean agregarMateria(Materia materia) {
		if (materias.contains(materia)) {
			return false;

		}
		materias.add(materia);
		return true;
	}

	public boolean agregarAula(Aula aula) {
		if (aulas.contains(aula)) {
			return false;

		}
		aulas.add(aula);
		return true;
	}

	public boolean agregarAlumno(Alumno alumno) {
		if (alumnos.contains(alumno)) {
			return false;
		}
		alumnos.add(alumno);
		return true;
	}

	public boolean agregarProfesor(Profesor profe) {
		if (profesores.contains(profe)) {
			return false;
		}
		profesores.add(profe);
		return true;
	}

	public boolean agregarComision(Comision comision) {
		if (this.comision.contains(comision)) {
			return false;
		}
		this.comision.add(comision);
		return true;
	}

	public boolean asignarMateriaCorrelativa(Integer codMateria, Integer codDeMateriaCorrelativa) {

		if (buscarMateriaPorCodigo(codMateria) != null && buscarMateriaPorCodigo(codDeMateriaCorrelativa) != null) {

			if (buscarMateriaPorCodigo(codDeMateriaCorrelativa)
					.agregarCorrelativa(buscarMateriaPorCodigo(codMateria))) {
				return true;
			}

		}
		return false;
	}

	public boolean eliminarMateriaCorrelativa(Integer codMateria, Integer codDeMateriaCorrelativa) {

		if (buscarMateriaPorCodigo(codMateria) != null && buscarMateriaPorCodigo(codDeMateriaCorrelativa) != null) {

			if (buscarMateriaPorCodigo(codMateria).eliminarCorrelativa(codDeMateriaCorrelativa)) {
				return true;
			}
		}
		return false;
	}

	public boolean inscribirAlumnoAComision(Integer dni, Integer idComision, LocalDate fecha) {

		Comision comision = buscarComisionPorId(idComision);
		if (verificarAlumnoCorrelativas(dni, comision.getMateria()) && verificarFechaDeInscripcion(comision, fecha)
				&& verificarDisponibilidadAula(comision.getAula().getId())
				&& verificarDisponibilidadAlumno(comision, dni) && verificarMateriaParaAnotar(comision, dni)) {

			comision.agregarAlumno(buscarAlumnoPorDni(dni));
			return true;
		}
		return false;
	}

	private boolean verificarDisponibilidadAlumno(Comision comi, Integer dni) {

		for (Comision comisionBuscada : comision) {
			if (comisionBuscada.getDia().equalsIgnoreCase(comi.getDia())
					&& comisionBuscada.getTurno().equalsIgnoreCase(comi.getTurno())) {

				for (Alumno alumno : comisionBuscada.getAlumnos()) {
					if (alumno.getDNI() == dni) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public boolean verificarMateriaParaAnotar(Comision comision, Integer dni) {

		Materia materia = comision.getMateria();
		List<Materia> matAprobadas = buscarAlumnoPorDni(dni).getMateriasAprobadas();

		for (Materia materias : matAprobadas) {
			if (materia.getCodigoMateria() == materias.getCodigoMateria()) {
				return false;
			}
		}

		return true;
	}

	public boolean verificarDisponibilidadAula(Integer id) {

		if (buscarAulaPorId(id).capacidadAula()) {
			return true;
		}
		return false;
	}

	public boolean verificarAlumnoCorrelativas(Integer dni, Materia materia) {

		List<Materia> matCorrelativas = materia.getMatCorrelativas();
		Integer cantidadMateriasNecesarias = 0;

		List<Materia> matAprobadas = buscarAlumnoPorDni(dni).getMateriasAprobadas();
		Integer cantidadMateriasAprobadas = 0;

		for (Materia materias : matCorrelativas) {
			cantidadMateriasNecesarias += 1;
			for (Materia materiaAprobada : matAprobadas) {

				if (materias.getCodigoMateria() == materiaAprobada.getCodigoMateria()) {
					cantidadMateriasAprobadas += 1;
				}

			}
		}

		return cantidadMateriasNecesarias == cantidadMateriasAprobadas;

	}

	public boolean verificarFechaDeInscripcion(Comision comision, LocalDate fecha) {

		if (fecha.isAfter(comision.getCicloLectivo().getIncioInscripciones())
				&& fecha.isBefore(comision.getCicloLectivo().getFinalInscripciones())) {
			return true;
		}
		return false;
	}

	public Materia buscarMateriaPorCodigo(Integer codigo) {
		for (Materia materia : materias) {
			if (materia.getCodigoMateria() == codigo) {
				return materia;
			}
		}
		return null;
	}

	public Alumno buscarAlumnoPorDni(Integer dni) {
		for (Alumno alumno : alumnos) {
			if (alumno.getDNI() == dni) {
				return alumno;
			}
		}
		return null;
	}

	public Comision buscarComisionPorId(Integer id) {
		for (Comision comision : comision) {
			if (comision.getId() == id) {
				return comision;
			}
		}
		return null;
	}

	public Aula buscarAulaPorId(Integer id) {

		for (Aula aula : aulas) {
			if (aula.getId() == id) {
				return aula;
			}
		}
		return null;
	}

	public Profesor buscarProfesorPorDni(Integer dni) {

		for (Profesor profe : profesores) {
			if (profe.getDNI() == dni) {
				return profe;
			}
		}
		return null;
	}

}
