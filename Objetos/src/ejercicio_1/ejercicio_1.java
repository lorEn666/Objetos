package ejercicio_1;

import java.util.Scanner;

public class ejercicio_1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		Persona p1 = new Persona("Borja", "73333333A", 'H', 28, 72, 1.74);
		Persona p2 = new Persona("Susana", 'M', 24);
		Persona p3 = new Persona();
		
		System.out.println(p1.calcularIMC());
		System.out.println(p2.calcularIMC());
		System.out.println(p3.calcularIMC());
		
		System.out.println(p1.esMayorDeEdad());
		System.out.println(p2.esMayorDeEdad());
		System.out.println(p3.esMayorDeEdad());
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		
		

	}

}
