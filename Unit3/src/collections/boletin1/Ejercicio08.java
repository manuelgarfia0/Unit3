package collections.boletin1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, String> usuarios = new HashMap<>();
		int opcion = 0;

		do {
			System.out.println("\n--- Control de Acceso ---");
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();
			sc.nextLine(); // limpiar buffer

			switch (opcion) {
			case 1:
				System.out.print("Introduce nombre de usuario: ");
				String usuario = sc.nextLine();

				if (usuarios.containsKey(usuario)) {
					System.out.println("El usuario ya existe. Elige otro nombre.");
				} else {
					System.out.print("Introduce contraseña: ");
					String contraseña = sc.nextLine();
					usuarios.put(usuario, contraseña);
					System.out.println("Usuario registrado correctamente.");
				}
				break;

			case 2: // Login
				System.out.print("Introduce nombre de usuario: ");
				String userLogin = sc.nextLine();

				int intentos = 3;
				boolean acceso = false;

				while (intentos > 0 && !acceso) {
					System.out.print("Introduce contraseña: ");
					String passLogin = sc.nextLine();

					if (usuarios.containsKey(userLogin) && usuarios.get(userLogin).equals(passLogin)) {
						System.out.println("Ha accedido al área restringida");
						acceso = true;
					} else {
						intentos--;
						if (intentos > 0) {
							System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intento(s).");
						} else {
							System.out.println("Lo siento, no tiene acceso al área restringida");
						}
					}
				}
				break;

			case 3:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
			}

		} while (opcion != 3);

		sc.close();
	}
}