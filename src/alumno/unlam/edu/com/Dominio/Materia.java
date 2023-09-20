package alumno.unlam.edu.com.Dominio;

import java.util.Objects;

public class Materia {
	private String materia;
	private Integer codigoMateria;
	private String descripcion;

	public Materia(String materia, Integer codigoMateria, String descripcion) {
		this.materia = materia;
		this.codigoMateria = codigoMateria;
		this.descripcion = descripcion;
	}

	
	
	public Integer getCodigoMateria() {
		return codigoMateria;
	}



	@Override
	public int hashCode() {
		return Objects.hash(codigoMateria);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		return Objects.equals(codigoMateria, other.codigoMateria);
	}
}
