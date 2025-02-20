package paqueteBiblioteca;

public class Autor {
	int cod_autor;
	String nombre;
	String apellido1;
	String apellido2;
	
	//Constructores
	//Completo
	public Autor(int cod_autor, String nombre, String apellido1, String apellido2) {
		super();
		this.cod_autor = cod_autor;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	
	//Codigo y nombre
	public Autor(int cod_autor, String nombre) {
		super();
		this.cod_autor = cod_autor;
		this.nombre = nombre;
	}
	
}
