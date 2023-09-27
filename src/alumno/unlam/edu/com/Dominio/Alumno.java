package alumno.unlam.edu.com.Dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona{

		private LocalDate fechaIngreso;
		private List<Materia> materiasAprobadas;
		
		public Alumno(String nombreYApellido, String fechaNacimineto, Integer DNI) {
			super(nombreYApellido, fechaNacimineto, DNI, fechaNacimineto, fechaNacimineto);
			this.setFechaIngreso(fechaIngreso);
			this.materiasAprobadas = new ArrayList<>();
		}
		
		public Materia buscarMateriaAprobada(Integer id) {
			Materia materiaBuscada = null;
			
			for (Materia materia : materiasAprobadas) {
				if (materia.getCodigoMateria() == id) {
					materiaBuscada = materia;
				}
			}
			return materiaBuscada;
		}
		
		public void agregarMateriaAprobada(Materia materia) {
			materiasAprobadas.add(materia);
		}

		public LocalDate getFechaIngreso() {
			return fechaIngreso;
		}

		public void setFechaIngreso(LocalDate fechaIngreso) {
			this.fechaIngreso = fechaIngreso;
		}
		
		public List<Materia> getMateriasAprobadas() {
			return materiasAprobadas;
		}

		public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
			this.materiasAprobadas = materiasAprobadas;
		}
}
