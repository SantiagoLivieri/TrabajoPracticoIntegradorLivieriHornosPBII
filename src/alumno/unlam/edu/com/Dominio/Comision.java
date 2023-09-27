package alumno.unlam.edu.com.Dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Comision {
	// Aca pueden ir todas las instancias de los examenes

	private Integer id;
	private Materia materia;
	private CicloLectivo cicloLectivo;
	private String turno;
	private String dia;
	private Aula aula;
	private Set<Profesor> profesores;
	private Set<Alumno> alumnos;
	private List<RegistroDeNotasDeExamen> registroNotas;

	public Comision(Integer id, Materia materia, CicloLectivo cicloLectivo, String turno, String dia) {
		super();
		this.id = id;
		this.materia = materia;
		this.cicloLectivo = cicloLectivo;
		this.turno = turno;
		this.dia = dia;
		this.profesores = new HashSet<>();
		this.alumnos = new HashSet<>();
		this.registroNotas = new ArrayList<>();
	}
	
	public void agregarRegistro(Integer dniAlumno, Nota nota) {
		RegistroDeNotasDeExamen registro = new RegistroDeNotasDeExamen(buscarAlumno(dniAlumno), nota);
		registroNotas.add(registro);
	}
	
	
	
	public Integer buscarNotaAlumno(Integer dniAlumno) {
		Integer nota = 0;
		
		for (RegistroDeNotasDeExamen registro : registroNotas) {
			if (registro.getAlumno().getDNI() == dniAlumno) {
				nota = registro.getNotas().getValor();
			}
		}
		
		return nota;
	}
	
	public void agregarProfesor() {
		Profesor profe = new Profesor(null, null, 1, null, null);
		profesores.add(profe);
	}

	public void agregarProfesor2() {
		Profesor profe = new Profesor(null, null, 2, null, null);
		profesores.add(profe);
	}

	public void agregarAlumno(Alumno alumno) {
		alumnos.add(alumno);

		if (alumnos.size() >= 1 && alumnos.size() <= 20) {
			agregarProfesor();

		}

		if (alumnos.size() >= 21 && alumnos.size() <= 40) {
			agregarProfesor();
			agregarProfesor2();
		}
	}

	public Set<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(Profesor profe) {
		for (Profesor profesor : profesores) {
			if (profesor.getNombreYApellido() == null) {
				profesor = profe;
				break;
			}
		}
	}
	
	public Alumno buscarAlumno(Integer dni) {
		for (Alumno alumno : alumnos) {
			if (alumno.getDNI() == dni) {
				return alumno;
			}
		}
		return null;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public CicloLectivo getCicloLectivo() {
		return cicloLectivo;
	}

	public void setCicloLectivo(CicloLectivo cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public Set<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
}
