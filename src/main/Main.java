package main;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Alumno;
import entities.Book;
import entities.Curso;
import entities.Pelicula;

public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		/**
		 * // 1. Se mostrará todos los perros guardados en el ArrayLis //
		 **/

		ArrayList<String> razas = new ArrayList<>();
		razas.add("Pug");
		razas.add("Boxer");
		razas.add("Caniche");
		razas.stream().forEach(x -> System.out.println(x));

		/**
		 * // 2. Continuando el ejercicio anterior, después de mostrar los perros, al //
		 * usuario se le pedirá un perro y se recorrerá la lista, se buscará el perro en
		 * // la lista. Si el perro está en la lista, se eliminará el perro que ingresó
		 * el // usuario y se mostrará la lista ordenada. //
		 **/

		System.out.println("ingrese la raza de un perro a eliminar");
		String razaEliminar = leer.next();

		razas.stream().filter(x -> (!(x.equals(razaEliminar)))).collect(Collectors.toList())
				.forEach(x -> System.out.println(x));

		/**
		 * // 3.Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere
		 * // calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
		 * // lista, se llama al método. Dentro del método se usará la lista notas para
		 * // calcular el promedio final de alumno. Siendo este promedio final, devuelto
		 * // por el método y mostrado en el main.
		 **/

		List<Alumno> listaAlumnos = new ArrayList<>();

		listaAlumnos.add(new Alumno("facundo", Arrays.asList(10, 8, 5)));
		listaAlumnos.add(new Alumno("fernando", Arrays.asList(7, 6, 10)));
		listaAlumnos.add(new Alumno("marcelo", Arrays.asList(10, 9, 10)));
		listaAlumnos.add(new Alumno("francisco", Arrays.asList(7, 9, 10)));
		listaAlumnos.add(new Alumno("giane", Arrays.asList(10, 8, 10)));
		listaAlumnos.add(new Alumno("susu", Arrays.asList(10, 10, 10)));
		listaAlumnos.add(new Alumno("dario", Arrays.asList(10, 8, 6)));
		listaAlumnos.add(new Alumno("rodrigo", Arrays.asList(7, 6, 1)));
		listaAlumnos.add(new Alumno("fernanda", Arrays.asList(5, 5, 0)));
		listaAlumnos.add(new Alumno("sofia", Arrays.asList(7, 2, 10)));
		listaAlumnos.add(new Alumno("emir", Arrays.asList(1, 8, 1)));
		listaAlumnos.add(new Alumno("marcela", Arrays.asList(8, 9, 1)));

		String nombreAlumno = "";

		listaAlumnos.stream().forEach(x -> {
			if (x.getNombre().equals(nombreAlumno)) {
				System.out.println("La nota final de " + x.getNombre() + " es : "
						+ x.getNotas().stream().mapToDouble(n -> n).average().getAsDouble());
			}
		});

//		 /**  
//		  4.Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
//		  Para esto, tendremos una clase Pelicula con el titulo, director y duración de
//		  la película (en horas). Implemente las clases y métodos necesarios para esta
//		  situación, teniendo en cuenta lo que se pide a continuación: 
//		  • Mostrar en pantalla todas las películas. 
//		  • Mostrar en pantalla todas las películas con una duración mayor a 1 hora. 
//		  • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. 
//		  • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla. 
//		  • Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla. 
//		  • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla. 
//		 **/
//		
		List<Pelicula> listaPeliculas = new ArrayList<>();
		listaPeliculas.add(new Pelicula("Spiderman", "fernando", 1.4));
		listaPeliculas.add(new Pelicula("El padrino", "facundo", 3.0));
		listaPeliculas.add(new Pelicula("Liga de la justicia", "nahir", 4.0));
		listaPeliculas.add(new Pelicula("Dune", "marcelo", 2.3));
		listaPeliculas.add(new Pelicula("007", "coppola", 2.0));
		listaPeliculas.add(new Pelicula("300", "german", 0.59));
		listaPeliculas.add(new Pelicula("Thor", "facundo", 1.0));

		System.out.println("Todas las películas");
		listaPeliculas.forEach(x -> System.out.println(
				"Titulo: " + x.getTitulo() + "- Director: " + x.getDirector() + "- Duracion: " + x.getHoras()));
		System.out.println("Todas las películas con una duración mayor a 1 hora");
		listaPeliculas.forEach(x -> {
			if (x.getHoras() > 1.0) {
				System.out.println(
						"Titulo: " + x.getTitulo() + "- Director: " + x.getDirector() + "- Duracion: " + x.getHoras());
			}
		});
		System.out.println("Ordenar las películas de acuerdo a su duración (de menor a mayor)");
		Comparator<Pelicula> duracion = Comparator.comparing(peli -> peli.getHoras());
		listaPeliculas.stream().sorted(duracion).forEach(x -> System.out.println(
				"Titulo: " + x.getTitulo() + "- Director: " + x.getDirector() + "- Duracion: " + x.getHoras()));
		System.out.println("Las películas de acuerdo a su duración (de mayor a menor)");
		listaPeliculas.stream().sorted(duracion.reversed()).forEach(x -> System.out.println(
				"Titulo: " + x.getTitulo() + "- Director: " + x.getDirector() + "- Duracion: " + x.getHoras()));
		System.out.println("Las películas por titulo, alfabéticamente");
		Comparator<Pelicula> titulo = Comparator.comparing(peli -> peli.getTitulo());
		listaPeliculas.stream().sorted(titulo).forEach(x -> System.out.println(
				"Titulo: " + x.getTitulo() + "- Director: " + x.getDirector() + "- Duracion: " + x.getHoras()));
		System.out.println("Las películas por director, alfabéticamente");
		Comparator<Pelicula> director = Comparator.comparing(peli -> peli.getDirector());
		listaPeliculas.stream().sorted(director).forEach(x -> System.out.println(
				"Titulo: " + x.getTitulo() + "- Director: " + x.getDirector() + "- Duracion: " + x.getHoras()));

		/**
		 * 5.se mostrará todos los países guardados en el conjunto. Después deberemos
		 * mostrar el conjunto ordenado alfabéticamente para esto recordar como se
		 * ordena un conjunto. Y por ultimo, al usuario se le pedirá un país y se
		 * recorrerá el conjunto con un Iterator, se buscará el país en el conjunto y si
		 * está en el conjunto se eliminará el país que ingresó el usuario y se mostrará
		 * el conjunto. Si el país no se encuentra en el conjunto se le informará al
		 * usuario.
		 */

		Set<String> paises = new HashSet<>();
		paises.add("Argentina");
		paises.add("Chile");
		paises.add("Argelia");
		paises.add("China");
		paises.add("Estados Unidos");
		paises.add("India");

		Comparator<String> paisComparator = Comparator.comparing(nombres -> nombres);
		paises.stream().sorted(paisComparator).forEach(x -> System.out.println(x));
		String pais = "Brasil";

		System.out.println("Lista nueva de paises");
		List<String> nuevaList = paises.stream().filter(x -> (!(x.equals(pais)))).collect(Collectors.toList());
		if (nuevaList.size() != paises.size()) {
			nuevaList.forEach(x -> System.out.println(x));
		} else {
			System.out.println("no se encontro el pais");
		}

		/**
		 * 6.Modificar su precio, eliminar un producto y mostrar los productos que
		 * tenemos con su precio (Utilizar Hashmap). El HashMap tendrá de llave el
		 * nombre del producto y de valor el precio.
		 **/
		HashMap<String, Integer> productos = new HashMap<>();
		productos.put("Harina 000", 50);
		productos.put("Harina 0000", 70);
		productos.put("Magdanelas", 150);
		productos.put("Yerba", 70);
		productos.put("Jabon", 80);

		productos.forEach((t, u) -> System.out.println("El nombre del producto es " + t + " y su precio " + u));

		String nombreProducto = "Jabon";
		Integer precioProducto = 100;
		productos.forEach((t, u) -> {
			if (t.equals(nombreProducto)) {
				productos.put(nombreProducto, precioProducto);
			}
		});
		productos.forEach((t, u) -> System.out.println("El nombre del producto es " + t + " y su precio " + u));

		System.out.println("la lista actualizada, sin los productos eliminados");
		productos.entrySet().stream().filter(x -> !(x.getKey().equals(nombreProducto)))
				.forEach(x -> System.out.println(x));

		List<Curso> cursos = new ArrayList<>();

		cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200));
		cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800));
		cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700));
		cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400));
		cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));

		System.out.println("cantidad de cursos de duracion mayor a 5 horas es : "
				+ cursos.stream().filter(d -> d.getDuracion() > 5).count());
		System.out.println("cantidad de cursos de duracion menor a 2 horas es : "
				+ cursos.stream().filter(d -> d.getDuracion() < 2).count());
		System.out.println("cursos con una cantidad de vídeos mayor a 50 :");
		cursos.stream().filter(x -> x.getVideos() > 50).forEach(x -> System.out.println(x.getTitulo()));

		Comparator<Curso> compararDuracion = Comparator.comparing(c -> c.getDuracion());
		System.out.println("el título de los 3 cursos con mayor duración");
		cursos.stream().sorted(compararDuracion.reversed()).limit(3).forEach(x -> System.out.println(x.getTitulo()));

		System.out.println(
				"la duración total de todos los cursos " + cursos.stream().mapToDouble(n -> n.getDuracion()).sum());

		System.out.println("Libros que superen el promedio en cuanto a\n" + "duración se refiere.");
		cursos.stream()
				.filter(x -> x.getDuracion() > cursos.stream().mapToDouble(n -> n.getDuracion()).average().orElse(0))
				.forEach(x -> System.out.println(x.getTitulo()));

		System.out.println(
				"la duración de todos aquellos cursos que tengan una cantidad\n" + "de alumnos inscritos menor a 500");
		cursos.stream().filter(x -> x.getAlumnos() < 500).forEach(c -> System.out.println(c.getDuracion()));

		System.out.println("Obtener el curso con mayor duración.");
		cursos.stream().sorted(compararDuracion.reversed()).limit(1).forEach(x -> System.out
				.println(x.getTitulo() + "-" + x.getDuracion() + "-" + x.getAlumnos() + "-" + x.getVideos()));

		List<String> titulos = cursos.stream().map(x -> x.getTitulo()).collect(Collectors.toList());
		System.out.println("Crear una lista de Strings con todos los titulos de los cursos.");
		titulos.forEach(x -> System.out.println(x));

		// funciones matematicas
		List<Integer> numerosFunciones = new ArrayList<>();
		numerosFunciones.add(1);
		numerosFunciones.add(2);
		numerosFunciones.add(3);
		numerosFunciones.add(4);
		numerosFunciones.add(5);
		numerosFunciones.add(6);
		numerosFunciones.add(7);
		numerosFunciones.add(8);
		numerosFunciones.add(9);
		numerosFunciones.add(10);

		// sum -> intStream -> mapToInt
		int suma = numerosFunciones.stream().mapToInt(n -> n).sum();
		System.out.println(suma);

		// average -> intStream
		double promedio = numerosFunciones.stream().mapToInt(n -> n).average().orElse(0);
		System.out.println(promedio);

		// min -> intStream
		int minimo = numerosFunciones.stream().mapToInt(n -> n).min().getAsInt();
		System.out.println(minimo);

		// max -> intStream
		int maximo = numerosFunciones.stream().mapToInt(n -> n).max().getAsInt();
		System.out.println(maximo);

		// Reduce
		int resultSuma = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduce(0,
				(acumulador, elemento) -> acumulador + elemento);
		System.out.println(resultSuma);

		String string = Stream.of("Java", "C", "Phyton", "Ruby").reduce("",
				(acumulador, lenguaje) -> acumulador + "" + lenguaje + "/");
		System.out.println(string);

		// distinct
		List<String> nameList = new ArrayList<>();
		nameList.add("facundo");
		nameList.add("fernando");
		nameList.add("felpudo");
		nameList.add("fernando");
		nameList.add("facundo");
		nameList.add("felpudo");

		nameList.stream().distinct().forEach(elemento -> System.out.println(elemento));

		// ordenar lista
		List<Integer> numerosIntegers = new ArrayList<>();
		numerosIntegers.add(1);
		numerosIntegers.add(2);
		numerosIntegers.add(3);
		numerosIntegers.add(4);
		numerosIntegers.add(5);
		numerosIntegers.add(6);
		numerosIntegers.add(7);
		numerosIntegers.add(8);
		numerosIntegers.add(9);

		List<Integer> resultAsc = numerosIntegers.stream().sorted().collect(Collectors.toList());
		List<Integer> resultDesc = numerosIntegers.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		List<Book> books = new ArrayList<>();

		books.add(new Book("El señor de los anillos", 150));
		books.add(new Book("Don Quijote de la mancha", 500));
		books.add(new Book("Historia de 2 cuidades", 200));
		books.add(new Book("El hobbit", 100));
		books.add(new Book("El principito", 140));

		Comparator<Book> comparatorCopias = Comparator.comparing(book -> book.getCantidadDePaginas());

		books.stream().sorted(comparatorCopias).forEach(book -> System.out.println(book.getTitulo()));

		books.stream().sorted(comparatorCopias.reversed()).limit(3)
				.forEach(book -> System.out.println(book.getTitulo()));

		books.stream().sorted(comparatorCopias.reversed()).limit(3).skip(1)
				.forEach(book -> System.out.println(book.getTitulo()));

	}
}
