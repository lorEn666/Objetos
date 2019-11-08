package ejercicio_1;

import java.util.Scanner;

public class Principal {

	private static void añadirPersona(Persona[] vClientes) {
		Scanner leerString = new Scanner(System.in);
		Scanner leerInt = new Scanner(System.in);
		String nombre, dni = "";
		double peso, altura = 0;
		int edad = 0;
		char sexo = ' ';

		for (int i = 0; i < vClientes.length; i++) {
			if (vClientes[i] == null) {
				System.out.println("Dime el nombre:");
				nombre = leerString.nextLine();
				if (nombre.equalsIgnoreCase("")) {
					vClientes[i] = new Persona();
					break;
				}
				System.out.println("Dime la edad:");
				edad = leerInt.nextInt();

				System.out.println("Dime el sexo:");
				sexo = leerString.next().charAt(0);

				leerString = new Scanner(System.in);

				System.out.println("Dime el DNI:");
				dni = leerString.nextLine();
				if (dni.equalsIgnoreCase("")) {
					vClientes[i] = new Persona(nombre, sexo, edad);
					break;
				}
				System.out.println("Dime la altura:");
				altura = leerInt.nextDouble();

				System.out.println("Dime el peso:");
				peso = leerInt.nextDouble();

				vClientes[i] = new Persona(nombre, dni, sexo, edad, peso, altura);

				break;

			}
		}
	}

	private static void verTodasPersonas(Persona[] vClientes) {
		for (int i = 0; i < vClientes.length; i++) {
			if (vClientes[i] != null) {
				System.out.println(vClientes[i]);
			}
		}
	}

	private static int buscarPersona(Persona[] v) {
		Scanner leer = new Scanner(System.in);
		String nombre = "";

		System.out.println("Dime el nombre de la persona a buscar:");
		nombre = leer.nextLine();

		for (int i = 0; i < v.length; i++) {
			if (v[i] != null && v[i].getNombre().equalsIgnoreCase(nombre)) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Persona[] vClientes = new Persona[100];
		MenuPrincipal menu = new MenuPrincipal();
		int opc = 0;

		do {
			opc = menu.pintaMenuPrincipal();
			switch (opc) {
			case 1:
				añadirPersona(vClientes);
				break;
			case 2:
				int pos = buscarPersona(vClientes);
				Persona p = vClientes[pos];
				break;
			case 3:
				break;
			case 4:
				verTodasPersonas(vClientes);
				break;
			case 5:
				break;
			default:
				break;
			}
		} while (opc != 5);

	}

}
