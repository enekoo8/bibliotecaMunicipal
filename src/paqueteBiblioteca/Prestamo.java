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

}
