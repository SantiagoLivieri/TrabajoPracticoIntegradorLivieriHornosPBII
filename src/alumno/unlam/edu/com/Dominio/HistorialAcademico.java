package alumno.unlam.edu.com.Dominio;

public class HistorialAcademico {
	
	private Integer id;
	private Alumno alumno;
	private Comision comision;
	
	public HistorialAcademico(Integer id ,Alumno alumno ,Comision comision) {
		this.id = id;
		this.alumno = alumno;
		this.comision = comision;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Comision getComision() {
		return comision;
	}

	public void setComision(Comision comision) {
		this.comision = comision;
	}
	
}
