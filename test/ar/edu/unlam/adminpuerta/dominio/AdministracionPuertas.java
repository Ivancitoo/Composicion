package ar.edu.unlam.adminpuerta.dominio;

public class AdministracionPuertas {

	public static void main(String[] args) {
		Cerradura candado = new Cerradura(0411);

		System.out.println("la cerradura esta " + candado.getEstado());

		candado.abrir(0411);
		System.out.println("la cerradura esta " + candado.getEstado());

		Puerta entrada = new Puerta(candado, "roja");
		Puerta salida = new Puerta("azul", 456);

		System.out.println("puerta de salida " + salida.verEstadoPuerta());
		salida.abrir(456);
		System.out.println("puerta de salida " + salida.verEstadoPuerta());

	}

}
