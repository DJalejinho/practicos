package Tercera_Implementación_La_Biblioteca;

public class Libro {
	String isbn, nombre, autor;

	public Libro(String isbn, String nombre, String autor) {
		super();
		this.isbn = isbn;
		this.nombre = nombre;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
}
