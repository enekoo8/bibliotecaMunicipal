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
	
	//Getters y Setters
	public int getCod_autor() {
		return cod_autor;
	}

	public void setCod_autor(int cod_autor) {
		this.cod_autor = cod_autor;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
		
}
