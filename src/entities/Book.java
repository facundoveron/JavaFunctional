package entities;

public class Book {
	private String titulo;
	private Integer cantidadDePaginas;
	
	public Book(String titulo, Integer cantidadDePaginas) {
		super();
		this.titulo = titulo;
		this.cantidadDePaginas = cantidadDePaginas;
	}

	public Integer getCantidadDePaginas() {
		return cantidadDePaginas;
	}

	public void setCantidadDePaginas(Integer cantidadDePaginas) {
		this.cantidadDePaginas = cantidadDePaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
