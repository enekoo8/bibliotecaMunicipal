package paqueteBiblioteca;

public class Socio {
	String DNI;
	String nombre;
	String apellido;
	String direcccion;
	int telefono;
	String correoElectronico;
	
	//Constructor completo
	public Socio(String dNI, String nombre, String apellido, String direcccion, int telefono,
	String correoElectronico) {
		super();
		this.DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direcccion = direcccion;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}

	//Constructor por defecto
	public Socio() {
		super();
		this.DNI = "99999999A";
		this.nombre = "Anonimo";
		this.apellido = "";
		this.direcccion = "";
		this.telefono = 999999999;
		this.correoElectronico = "";
	}
		
	//Constructor DNI, nombre y apellido
	public Socio(String dNI, String nombre, String apellido) {
		super();
		this.DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
	}

}
