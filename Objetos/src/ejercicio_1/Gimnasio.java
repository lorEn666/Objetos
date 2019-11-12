package ejercicio_1;

import java.util.Scanner;

public class Gimnasio {

	private String nombre;
	private String localizacion;
	private Persona[] vClientes;

	public Gimnasio() {
		nombre = "";
		localizacion = "";
		vClientes = new Persona[50];
	}

	public Gimnasio(String nombre) {
		this.nombre = nombre;
		localizacion = "";
		vClientes = new Persona[50];
	}

	public Gimnasio(String nombre, String localizacion) {
		this.nombre = nombre;
		this.localizacion = localizacion;
		vClientes = new Persona[50];
	}

	public Gimnasio(String nombre, String localizacion, Persona[] vClientes) {
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.vClientes = vClientes;
	}

	public Gimnasio(String nombre, String localizacion, int clientesMaximo) {
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.vClientes = new Persona[clientesMaximo];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public Persona[] getvClientes() {
		return vClientes;
	}

	public void añadirPersona() {
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

	public void verTodasPersonas() {
		for (int i = 0; i < vClientes.length; i++) {
			if (vClientes[i] != null) {
				System.out.println(vClientes[i]);
			}
		}
	}

	public Persona buscarPersona() {
		Scanner leer = new Scanner(System.in);
		String nombre = "";

		System.out.println("Dime el nombre de la persona a buscar:");
		nombre = leer.nextLine();

		for (int i = 0; i < vClientes.length; i++) {
			if (vClientes[i] != null && vClientes[i].getNombre().equalsIgnoreCase(nombre)) {

				return vClientes[i];
			}
		}

		return null;
	}
	
	public boolean borrarPersona() {
		Scanner leer = new Scanner(System.in);
		String nombre = "";

		System.out.println("Dime el nombre de la persona a borrar:");
		nombre = leer.nextLine();

		for (int i = 0; i < vClientes.length; i++) {
			if (vClientes[i] != null && vClientes[i].getNombre().equalsIgnoreCase(nombre)) {
				vClientes[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public void editarPersona(Persona persona) {
		Scanner leer2 = new Scanner(System.in);
		System.out.println("Dime el nuevo nombre:");
		persona.setNombre(leer2.nextLine());
	}

}
