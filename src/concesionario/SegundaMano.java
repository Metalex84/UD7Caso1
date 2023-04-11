package concesionario;

// La clase SegundaMano hereda de Producto
public class SegundaMano extends Producto{
	
	// Atributos
	private int kilometraje;
	private String nombrePropietarioAnterior;
	
	
	// Constructor
	public SegundaMano(String matricula, String color, String modelo, int kilometraje, String nombrePropietarioAnterior) {
		super(matricula, color, modelo);
		this.kilometraje = kilometraje;
		this.nombrePropietarioAnterior = nombrePropietarioAnterior;

	}
	
	
	// Métodos getter y setter
	
	public String getNombrePropietarioAnterior() {
		return nombrePropietarioAnterior;
	}
	public void setNombrePropietarioAnterior(String nombrePropietarioAnterior) {
		this.nombrePropietarioAnterior = nombrePropietarioAnterior;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	// Implementacion propia del metodo toString, llamando al constructor de la superclase y añadiendo los atributos propios

	@Override
	public String toString() {
		return super.toString() + "Es de segunda mano, tiene " + kilometraje + " kilometros y pertenecio a " + nombrePropietarioAnterior +".";
	}
	
}
