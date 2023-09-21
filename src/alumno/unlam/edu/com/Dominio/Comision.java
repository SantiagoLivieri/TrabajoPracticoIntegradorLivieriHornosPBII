package alumno.unlam.edu.com.Dominio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Comision {
	
	private Integer id;
	private Materia materia;
	private CicloLectivo cicloLectivo;
	private String turno;
	private String dia;
	private Aula aula;
	private Set<Profesor> profesores;
	private Set<Alumno> alumnos;
	private Map<Alumno, Nota> resgistroNotas;
	
	 public Comision(Integer id, Materia materia, CicloLectivo cicloLectivo, String turno, String dia,Aula aula) {
		 super();
		 this.id = id;
		 this.materia = materia;
		 this.cicloLectivo = cicloLectivo;
		 this.turno = turno;
		 this.dia = dia;
		 this.profesores = new HashSet<>();
		 this.alumnos = new HashSet<>();
		 this.resgistroNotas = new HashMap<>();
	 }
	 
	
}
