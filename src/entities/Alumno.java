package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * @author facundo
 *
 */
public class Alumno {
	private String nombre;
	private List<Integer> notas;

	public Alumno() {
	}
	
	public Alumno(String nombre, List<Integer> notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Integer> getNotas() {
		return notas;
	}

	public void setNotas(List<Integer> notas) {
		this.notas = notas;
	}
	
}
