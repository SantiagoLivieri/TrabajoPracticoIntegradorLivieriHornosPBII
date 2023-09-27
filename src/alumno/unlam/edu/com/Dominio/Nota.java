package alumno.unlam.edu.com.Dominio;

public class Nota {
	private Integer valor;
	private TipoNota tipoDeNota;

	public Nota(TipoNota tipoDeNota, Integer valor) {
		super();
		this.tipoDeNota = tipoDeNota;
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public TipoNota getTipoDeNota() {
		return tipoDeNota;
	}

	public void setTipoDeNota(TipoNota tipoDeNota) {
		this.tipoDeNota = tipoDeNota;
	}
	
	
}
