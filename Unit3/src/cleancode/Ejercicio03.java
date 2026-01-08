package cleancode;

import java.util.Scanner;

public class Ejercicio03 {
	/**
	 * Pide el pin al usuario, si supera los intentos definidos se bloquea la cuenta
	 * 
	 * @param sc Scanner para que el usuario pueda escribir por teclado
	 * @return acceso Si es -1 se bloqueará, si es 1 accederá
	 */
	static int accesoCuentaBancaria(Scanner sc) {
		int intentos = 0;
		int acceso = 0; // contadores

		while (intentos < 3) {
			System.out.println("PIN:");
			int pin = sc.nextInt();
			if (pin == 1234) {
				acceso = 1;
				return acceso;
			} else {
				System.out.println("Incorrecto");
			}
			intentos = intentos + 1;
		}
		return acceso;
	}

	static double menu(Scanner sc, String[] h, int[] k, double s) {
		int op = 0;
		double c = 0; // variables
		String t = ""; // texto
		// aqui se ejecuta el cajero automatico, es muy facil
		while (op != 5) {
			System.out.println("1ing 2ret 3sal 4his 5x");
			op = sc.nextInt();
			if (op == 1) {
				System.out.println("cuanto");
				c = sc.nextDouble();
				if (c <= 0) {
					System.out.println("no");
				} else {
					s = s + c;
					h[k[0] % 5] = "ING " + c + " saldo=" + s;
					k[0] = k[0] + 1;
				}
			} else if (op == 2) {
				System.out.println("cuanto");
				c = sc.nextDouble();
				if (c <= 0) {
					System.out.println("no");
				} else if (c > s) {
					System.out.println("nop");
				} else {
					s = s - c;
					h[k[0] % 5] = "RET " + c + " saldo=" + s;
					k[0] = k[0] + 1;
				}
			} else if (op == 3) {
				System.out.println("saldo " + s);
			} else if (op == 4) {
				System.out.println("HIST");
				for (int z = 0; z < 5; z++) {
					if (h[z] != null)
						System.out.println(h[z]);
					else
						System.out.println("-"); // rellena con guiones por estética
				}
			} else {
				if (op != 5)
					System.out.println("???");
			}
		}
		return s; // devuelve saldo (porque si)
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double saldo = 500;
		String[] h = new String[5];
		int[] k = new int[] { 0 };
		int acceso = accesoCuentaBancaria(sc);

		if (acceso == -1) {
			System.out.println("Bloqueado");
		} else if (acceso == 0) {
			System.out.println("Error. Intentelo de nuevo");
		}

		saldo = menu(sc, h, k, saldo);
		System.out.println("Cerrando sesión...");

		// Cerrar scanner
		sc.close();
	}
}