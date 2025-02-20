package paqueteBiblioteca;

public class Libro {
	String titulo;
	int ISBN;
	
	//Constructor completo
	public Libro(String titulo, int iSBN) {
		super();
		this.titulo = titulo;
		ISBN = iSBN;
	}

	//Getters y Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	//Otros metodos
	//ToString
	@Override
	public String toString() {
		return "Libro: " + titulo + ", ISBN=" + ISBN;
	}
	
}
