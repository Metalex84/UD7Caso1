package concesionario;

// La clase Km0 hereda de Producto
public class Km0 extends Producto{

	// Atributo propio
	private int kilometraje;
	
	// Constructor
	public Km0(String matricula, String color, String modelo, int kilometraje) {
		super(matricula, color, modelo);
		this.kilometraje = kilometraje;
	
	}
	
	// Métodos getter y setter

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	// Implementacion propia del metodo toString, llamando al constructor de la superclase y añadiendo los atributos propios

	@Override
	public String toString() {
		return super.toString() + "Es Km0 y tiene "+ kilometraje + " kilometros.";
	}
	

}
