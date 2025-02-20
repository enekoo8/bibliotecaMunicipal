package paqueteBiblioteca;

public class Penalizacion {
	String descripcion; //Información sobre la penalización
	
	//Constructor completo
	public Penalizacion(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	//Getters y Setters
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
