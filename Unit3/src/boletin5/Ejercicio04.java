package boletin5;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		String frase;
		String fraseInvertida;
		// Preguntar al usuario que introduzca una frase
		System.out.println("Introduce una frase para mostrarla invertida: ");
		frase = sc.nextLine();
		// Llamamos a la funcion para mostrarla invertida
		fraseInvertida = invertido(frase);
		// Muestro la frase
		System.out.println(fraseInvertida);
		// Cierro scanner
		sc.close();
	}

	static String invertido(String frase) {
		// Inicializar variable para la frase invertida
		String fraseInvertida = "";
		// Bucle que recorre la frase al revés y almacena los carácteres en
		// fraseInvertida
		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseInvertida += frase.charAt(i);
		}
		// Devuelvo fraseInvertida
		return fraseInvertida;
	}

}
