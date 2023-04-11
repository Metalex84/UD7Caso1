package concesionario;

// Clase abstracta
public abstract class Producto {
	
	// Atributos
	private String matricula;
	private String color;
	private String modelo;
	
	// Constructor 
	public Producto(String matricula, String color, String modelo) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
	}
	
	// Métodos getter y setter

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Implementacion propia del metodo toString
	@Override
	public String toString() {
		return "El coche tiene la matricula " + matricula + ", el color es " + color + ", el modelo es " + modelo + ". ";
	}
	

}
