package boletin5;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		String contraseña;
		String adivinar = "";
		// Preguntar al primer jugador que introduzca la contraseña
		System.out.println("Introduce la contraseña a adivinar: ");
		contraseña = sc.nextLine();
		// Bucle para advinar la contraseña
		while (!adivinar.equals(contraseña)) {
			System.out.println("Introduce un contraseña: ");
			adivinar = sc.nextLine();
			if (adivinar.compareTo(contraseña) > 0) {
				System.out.println("La contraseña es mayor alfabeticamente.");
			} else if (adivinar.compareTo(contraseña) < 0) {
				System.out.println("La contraseña es menor alfabeticamente.");
			}
		}
		// Si sale del bucle es porque ha adivinado la contraseña
		System.out.println("Felicidades, has adivinado la contraseña");
		// Cerrar scanner
		sc.close();
	}

}
