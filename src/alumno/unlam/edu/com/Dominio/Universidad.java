package alumno.unlam.edu.com.Dominio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Universidad {
	private List<Materia> materias;
	private Set<Alumno> alumnos;
	private Set<Profesor> profesores;
	private Set<CicloLectivo> ciclosLectivos;
	private Set<Comision> comision;
	private Set<Aula> aulas;
	
	public Universidad() {
		materias = new ArrayList<>();
		alumnos = new HashSet<>();
		profesores = new HashSet<>();
		ciclosLectivos = new HashSet<>();
		comision = new HashSet<>();
		aulas = new HashSet<>();
	}
	
	public boolean agregarMateria (Materia materia) {
		if(materias.contains(materia)) {
			return false;
			
		}materias.add(materia);
		return true;
	}
	
	
}
