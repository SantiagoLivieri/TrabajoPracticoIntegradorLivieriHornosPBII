package alumno.unlam.edu.com.Dominio;

import java.util.Objects;

public class Persona {
	private String nombreYApellido;
	private String fechaNacimineto;
	private Integer DNI;
	private String eMail;
	private String telefono;

	public Persona(String nombreYApellido, String fechaNacimineto, Integer DNI, String eMail, String telefono) {
		this.nombreYApellido = nombreYApellido;
		this.fechaNacimineto = fechaNacimineto;
		this.DNI = DNI;
		this.eMail = eMail;
		this.telefono = telefono;
	}

	public Integer getDNI() {
		return DNI;
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DNI);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(DNI, other.DNI);
	}
}
