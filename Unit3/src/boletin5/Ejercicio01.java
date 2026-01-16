package boletin5;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		String frase1;
		String frase2;
		// Preguntar al usuario
		System.out.println("Introduce una frase: ");
		frase1 = sc.nextLine();
		System.out.println("Introduce otra frase: ");
		frase2 = sc.nextLine();
		// Comparar frases
		System.out.println(frase2.compareTo(frase1) < 0 ? "La segunda frase es más corta que la primera."
				: "La primera frase es más corta que la segundaS.");
	}

}
