package concesionario;

public class PrincipalUD7Caso1 {

	public static void main(String[] args) {

		// La clase Producto es abstracta; por lo tanto, no se puede instanciar.
		// En su lugar, se instancian las clases que heredan de ella
		
		Km0 coche1 = new Km0 ("1234-FFF", "Blanco", "Ford Fiesta", 10000);
		SegundaMano coche2 = new SegundaMano ("4321-BJC", "Amarillo", "Volkswagen Golf", 200000, "Chimo Bayo");
		Nuevo coche3 = new Nuevo ("9876-LMB", "Negro", "Kia Niro");
		
		System.out.println(coche1.toString());
		System.out.println(coche2.toString());
		System.out.println(coche3.toString());

		
	}

}
