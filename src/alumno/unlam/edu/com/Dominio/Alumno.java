package alumno.unlam.edu.com.Dominio;

import java.time.LocalDate;

public class Alumno extends Persona{

		private LocalDate fechaIngreso;
		
		public Alumno(String nombreYApellido, String fechaNacimineto, Integer DNI) {
			super(nombreYApellido, fechaNacimineto, DNI, fechaNacimineto, fechaNacimineto);
			this.setFechaIngreso(fechaIngreso);
		}

		public LocalDate getFechaIngreso() {
			return fechaIngreso;
		}

		public void setFechaIngreso(LocalDate fechaIngreso) {
			this.fechaIngreso = fechaIngreso;
		}

}
