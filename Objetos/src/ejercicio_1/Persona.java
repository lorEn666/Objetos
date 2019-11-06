package ejercicio_1;

import java.util.Random;
import java.util.Scanner;

public class Persona {

	// Atributos

	private String nombre, dni;
	private char sexo;
	private int edad;
	private double peso, altura;
	private final char hombre = 'H'; // Constante

	// Constructor

	public Persona() {
		nombre = "";
		dni = "";
		sexo = hombre;
		edad = 0;
		peso = 0;
		altura = 0;
	}

	// Constructor sobrecargado generado desde 'Source'/'Generate constructor using
	// fields'

	public Persona(String nombre, char sexo, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		comprobarSexo(sexo);
		dni = "";
		peso = 0;
		altura = 0;
	}

	// Constructor sobrecargado generado desde 'Source'

	public Persona(String nombre, String dni, char sexo, int edad, double peso, double altura) {
		this.nombre = nombre;
		this.dni = dni;
		comprobarSexo(sexo);
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	// Método 1

	public int calcularIMC() {
		double imc = 0;
		final int bajoPeso = -1;
		final int pesoCorrecto = 0;
		final int sobrePeso = 1;

		imc = peso / (altura * altura);

		if (imc < 18.5) {
			return bajoPeso;
		} else if (imc <= 25) {
			return pesoCorrecto;
		} else {
			return sobrePeso;
		}

	}

	// Método 2

	public boolean esMayorDeEdad() {
		boolean mayorEdad = true;

		if (edad >= 18) {
			return (mayorEdad);
		} else {
			return (!mayorEdad);
		}

	}

	// Método 3

	private void comprobarSexo(char sexo) {
		Scanner leer = new Scanner(System.in);

		if (sexo != 'M' || sexo != 'H') {
			sexo = hombre;
		}
	}

	// Método 4

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	// Método 5
	
	private void generaDNI() {
		Random dniAleatorio = new Random();
		int num = dniAleatorio.nextInt(10);
				
		for (int i = 0; i < 8; i++) {
			dni.substring(i, i+1) = dniAleatorio[num];
		}
	}
	
	// Setters

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Getters

	public String getNombre() {
		return this.nombre;
	}

	public String getDni() {
		return this.dni;
	}

	public char getSexo() {
		return this.sexo;
	}

	public int getEdad() {
		return this.edad;
	}

	public double getPeso() {
		return this.peso;
	}

	public double getAltura() {
		return this.altura;
	}

}
