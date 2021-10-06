package ar.edu.unlam.adminpuerta.dominio;

public class Cerradura {

	private int clave;
	private boolean estado;

	public Cerradura(int clave) {
		this.clave = clave;
		this.estado =false;
	}
	
	public boolean abrir(int clave) {
		if (clave == this.clave) {
			this.estado = true;
		}

		return this.estado;
	}

	public void cerrar() {
		this.estado = false;
	}


	public void setClave(int clave) {
		this.clave = clave;
	}

	public boolean getEstado() {
		return estado;
	}
	
	
	

}
