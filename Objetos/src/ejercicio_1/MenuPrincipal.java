package ejercicio_1;

import java.util.Scanner;

public class MenuPrincipal {

	public MenuPrincipal() {

	}

	public int pintaMenuPrincipal() {
		int opc = 0;

		do {
			Scanner leer = new Scanner(System.in);
			System.out.println("*****MENÚ PRINCIPAL*****");
			System.out.println("1- Añadir persona");
			System.out.println("2- Buscar persona");
			System.out.println("3- Borrar persona");
			System.out.println("4- Ver todos los clientes");
			System.out.println("5- Salir");
			System.out.println("************************");
			opc = leer.nextInt();
		} while (opc < 1 || opc > 5);

		return opc;
	}

	public int pintaMenuPersona() {
		int opc = 0;

		do {
			Scanner leer = new Scanner(System.in);
			System.out.println("*****MENÚ PERSONA*****");
			System.out.println("1- Ver si es mayor de edad");
			System.out.println("2- Comprobar IMC");
			System.out.println("3- Ver datos personales");
			System.out.println("4- Editar datos personales");
			System.out.println("5- Volver");
			System.out.println("**********************");
			opc = leer.nextInt();
		} while (opc < 1 || opc > 5);

		return opc;
	}

}
