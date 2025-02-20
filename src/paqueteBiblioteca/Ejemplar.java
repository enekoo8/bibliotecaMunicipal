package paqueteBiblioteca;

public class Ejemplar {
	int codigo;
	String estado;
	
	//Constructor completo
	public Ejemplar(int codigo, String estado) {
		super();
		this.codigo = codigo;
		this.estado = estado;
	}
	
	//Getters y Setters
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	//Otros metodos
	//ToString
	@Override
	public String toString() {
		return "El ejemplar con codigo " + codigo + "está "+ estado;
	}

}
