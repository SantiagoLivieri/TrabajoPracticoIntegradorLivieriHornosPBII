package alumno.unlam.edu.com.Dominio;

public class RegistroDeNotasDeExamen {

		private Alumno alumno;
		private Nota notas;
		
		public RegistroDeNotasDeExamen(Alumno alumno, Nota notas) {
			super();
			this.alumno = alumno;
			this.notas = notas;
		}

		public Alumno getAlumno() {
			return alumno;
		}

		public void setAlumno(Alumno alumno) {
			this.alumno = alumno;
		}

		public Nota getNotas() {
			return notas;
		}

		public void setNotas(Nota notas) {
			this.notas = notas;
		}
		
		
}
