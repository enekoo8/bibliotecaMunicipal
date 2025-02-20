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

	//Getters & Setters
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		this.DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDirecccion() {
		return direcccion;
	}

	public void setDirecccion(String direcccion) {
		this.direcccion = direcccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	//Otros metodos
	//ToString
	@Override
	public String toString() {
		return "Socio: [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", direcccion=" + direcccion
				+ ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + "]";
	}

	//Metodo que simula el envio de un mensaje por correo electronico
	public void enviarNotificacion(String mensaje) {
		System.out.println("Enviando correo a " + correoElectronico + ": " + mensaje);
	}

}
