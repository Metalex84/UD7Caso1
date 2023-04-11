package concesionario;

// La clase Nuevo hereda de Producto
public class Nuevo extends Producto{

	// Llama al constructor de la superclase y no agrega ningún atributo ni método propio
	public Nuevo(String matricula, String color, String modelo) {
		super(matricula, color, modelo);

	}
	
	// Implementacion propia del metodo toString, llamando al constructor de la superclase

	@Override
	public String toString() {
		return super.toString();
	}

	
}
