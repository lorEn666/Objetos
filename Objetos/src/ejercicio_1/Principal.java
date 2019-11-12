package ejercicio_1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Gimnasio gym = new Gimnasio("InfoGym", "Alcañiz", 20);
		MenuPrincipal menu = new MenuPrincipal();
		int opc = 0;

		do {
			opc = menu.pintaMenuPrincipal();
			switch (opc) {
			case 1:
				gym.añadirPersona();
				break;
			case 2:
				Persona persona = gym.buscarPersona();
				if (persona == null) {
					System.out.println("No se ha encontrado la persona.");
				} else {
					int opc2 = 0;

					do {
						opc2 = menu.pintaMenuPersona();
						switch (opc2) {
						case 1:
							if (persona.esMayorDeEdad()) {
								System.out.println("Es mayor de edad.");
							} else {
								System.out.println("Es menor de edad.");
							}
							break;
						case 2:
							persona.calcularIMC();
							switch (persona.calcularIMC()) {
							case -1:
								System.out.println(persona.getNombre() + " está muy delgado.");
								break;
							case 0:
								System.out.println(persona.getNombre() + " está perfectamente.");
								break;
							case 1:
								System.out.println(persona.getNombre() + " está lejos de su peso ideal.");
								break;
							default:
								break;
							}
							break;
						case 3:
							System.out.println(persona);
							break;
						case 4:
							gym.editarPersona(persona);
							break;
						case 5:
							break;
						default:
							break;
						}
					} while (opc2 != 5);
				}

				break;
			case 3:
				boolean borrado = gym.borrarPersona();
				if (borrado) {
					System.out.println("Persona borrada");
				} else {
					System.out.println("Persona no encontrada");
				}
				break;
			case 4:
				gym.verTodasPersonas();
				break;
			case 5:
				break;
			default:
				break;
			}
		} while (opc != 5);

	}

}
