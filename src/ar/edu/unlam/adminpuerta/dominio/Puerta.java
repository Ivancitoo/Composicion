package ar.edu.unlam.adminpuerta.dominio;

public class Puerta {

	private Cerradura cerradura;
	private String color;

	public Puerta(Cerradura cerradura, String color) {  //este constructor recibe el objeto cerradura, agregacion
		
		this.cerradura = cerradura;
		this.color = color;
	}

	public Puerta(String color, int clave) {             //este constructor recibe una clave y crea una cerradura, composicion
		this.color = color;
		this.cerradura = new Cerradura(clave);
	}

	
	public boolean verEstadoPuerta(){
		return cerradura.getEstado();
	}
	
	public boolean abrir(int clave) {
		cerradura.abrir(clave);
		return cerradura.getEstado();
	}
}
