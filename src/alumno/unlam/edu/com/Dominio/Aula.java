package alumno.unlam.edu.com.Dominio;

import java.util.Objects;

public class Aula {

	private final Integer CAPACIDAD_MAXIMA_ALUMNOS = 40;
	private Integer id;
	private Alumno[] alumnos;

	public Aula(Integer id) {
		this.id = id;
		this.alumnos = new Alumno[CAPACIDAD_MAXIMA_ALUMNOS];
	}

	public Integer getId() {
		return id;
	}

	public boolean capacidadAula() {
		Integer contador = 0;

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				contador = contador + 1;
			}
		}

		return CAPACIDAD_MAXIMA_ALUMNOS > contador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		return Objects.equals(id, other.id);
	}
}
