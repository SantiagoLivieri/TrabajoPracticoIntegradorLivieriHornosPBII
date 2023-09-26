package alumno.unlam.edu.com.Dominio;

import java.time.LocalDate;
import java.util.Objects;

public class CicloLectivo {
	private LocalDate incioInscripciones;
	private LocalDate finalInscripciones;
	private LocalDate inicioCuatrimestre;
	private LocalDate finalCuatrimestre;

	public CicloLectivo(LocalDate incioInscripciones, LocalDate finalInscripciones, LocalDate inicioCuatrimestre,
			LocalDate finalCuatrimestre) {
		this.incioInscripciones = incioInscripciones;
		this.finalInscripciones = finalInscripciones;
		this.inicioCuatrimestre = inicioCuatrimestre;
		this.finalCuatrimestre = finalCuatrimestre;
	}

	public boolean NoSeRepitanCiclosLectivos(LocalDate inicioCuatrimestre1, LocalDate finalCuatrimestre1) {
		if (inicioCuatrimestre == inicioCuatrimestre1) {
			return false;
		} else if (finalCuatrimestre == finalCuatrimestre1) {
			return false;
		}
		return true;
	}

	public LocalDate getIncioInscripciones() {
		return incioInscripciones;
	}

	public void setIncioInscripciones(LocalDate incioInscripciones) {
		this.incioInscripciones = incioInscripciones;
	}

	public LocalDate getFinalInscripciones() {
		return finalInscripciones;
	}

	public void setFinalInscripciones(LocalDate finalInscripciones) {
		this.finalInscripciones = finalInscripciones;
	}

	public LocalDate getFinalCuatrimestre() {
		return finalCuatrimestre;
	}

	public void setFinalCuatrimestre(LocalDate finalCuatrimestre) {
		this.finalCuatrimestre = finalCuatrimestre;
	}

	public LocalDate getInicioCuatrimestre() {
		return inicioCuatrimestre;
	}

	public void setInicioCuatrimestre(LocalDate inicioCuatrimestre) {
		this.inicioCuatrimestre = inicioCuatrimestre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(inicioCuatrimestre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CicloLectivo other = (CicloLectivo) obj;
		return Objects.equals(inicioCuatrimestre, other.inicioCuatrimestre);
	}
}