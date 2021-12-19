package entities;

public class Pelicula {

	private String titulo;
	private String director;
	private Double horas;
	
	public Pelicula() {
		super();
	}
	
	public Pelicula(String titulo, String director, Double horas) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.horas = horas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Double getHoras() {
		return horas;
	}

	public void setHoras(Double horas) {
		this.horas = horas;
	}
	
}
