package paqueteBiblioteca;

import java.util.*;

public class Prestamo {
	Date fechaInicio;
	Date fechaDevolucion;
	
	//Constructor completo
	public Prestamo(Date fechaInicio, Date fechaDevolucion) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaDevolucion = fechaDevolucion;
	}
	
	//Constructor sin devolución
	public Prestamo(Date fechaInicio) {
		super();
		this.fechaInicio = fechaInicio;
	}
	
	//Getters y Setters
	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	//Otros metodos
	//ToString
	@Override
	public String toString() {
		return "Prestamo: [fechaInicio=" + fechaInicio + ", fechaDevolucion=" + fechaDevolucion + "]";
	}
	
	//Metodo para saber si el libro está devuelto
	public boolean estaDevuelto() {
		if (fechaDevolucion == null){
			return false;
		}
		return true;
	}

}
