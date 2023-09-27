package alumno.unlam.edu.com.Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Materia {
	private String materia;
	private Integer codigoMateria;
	private String descripcion;
	private List<Materia> matCorrelativas;

	public Materia(String materia, Integer codigoMateria, String descripcion) {
		this.materia = materia;
		this.codigoMateria = codigoMateria;
		this.descripcion = descripcion;
		matCorrelativas = new ArrayList<>();
	}
	
	public boolean agregarCorrelativa(Materia materiaCorrelativa) {

		if (materiaCorrelativa != null) {
			matCorrelativas.add(materiaCorrelativa);
			return true;
		}
		return false;
	}

	public boolean eliminarCorrelativa(Integer codigo) {

		if (buscarMateriaPorCodigo(codigo) != null) {
			matCorrelativas.remove(buscarMateriaPorCodigo(codigo));
			return true;
		}
		return false;
	}

	public Materia buscarMateriaPorCodigo(Integer codigo) {
		for (Materia materia : matCorrelativas) {
			if (materia.getCodigoMateria() == codigo) {
				return materia;
			}
		}
		return null;
	}

	public List<Materia> getMatCorrelativas() {
		return matCorrelativas;
	}

	public void setMatCorrelativas(List<Materia> matCorrelativas) {
		this.matCorrelativas = matCorrelativas;
	}

	public Integer contarCorrelativas() {
		return matCorrelativas.size();
	}

	public Integer getCodigoMateria() {
		return codigoMateria;
	}
	
	

	public String getNombreMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
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
