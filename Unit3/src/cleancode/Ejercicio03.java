package cleancode;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		final int PIN_CORRECTO = 1234;
		final int INTENTOS_MAX = 3;
		final int HISTORIAL_MAX = 5;

		Scanner scanner = new Scanner(System.in);

		double saldo = 500.0;
		String[] historial = new String[HISTORIAL_MAX];
		int[] contadorHistorial = new int[] { 0 };

		// Verificación de PIN
		boolean acceso = verificarPin(scanner, PIN_CORRECTO, INTENTOS_MAX);

		if (!acceso) {
			System.out.println("Bloqueado o intento incorrecto");
		} else {
			saldo = ejecutarMenu(scanner, historial, contadorHistorial, saldo);
			System.out.println("Cerrando sesión...");
		}

		scanner.close();
	}

	/**
	 * Verifica el PIN del usuario con un solo return
	 */
	private static boolean verificarPin(Scanner sc, int pinCorrecto, int intentosMax) {
		boolean acceso = false; // valor por defecto
		int intento = 0;

		while (intento < intentosMax) {
			System.out.print("Ingrese PIN: ");
			int pinIngresado = sc.nextInt();

			if (pinIngresado == pinCorrecto) {
				acceso = true; // correcto
				intento = intentosMax; // salir del bucle
			} else {
				System.out.println("PIN incorrecto");
				intento++;
			}
		}

		return acceso; // un único return
	}

	/**
	 * Ejecuta el menú del cajero automático
	 */
	private static double ejecutarMenu(Scanner sc, String[] historial, int[] contadorHistorial, double saldo) {
		int opcion = 0;
		double monto;

		while (opcion != 5) {
			System.out.println("Menú: 1-Ingresar 2-Retirar 3-Ver Saldo 4-Historial 5-Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Ingrese monto: ");
				monto = sc.nextDouble();
				if (monto <= 0) {
					System.out.println("Monto no válido");
				} else {
					saldo += monto;
					registrarOperacion(historial, contadorHistorial, "ING", monto, saldo);
				}
				break;

			case 2:
				System.out.print("Ingrese monto: ");
				monto = sc.nextDouble();
				if (monto <= 0) {
					System.out.println("Monto no válido");
				} else if (monto > saldo) {
					System.out.println("Saldo insuficiente");
				} else {
					saldo -= monto;
					registrarOperacion(historial, contadorHistorial, "RET", monto, saldo);
				}
				break;

			case 3:
				System.out.println("Saldo actual: " + saldo);
				break;

			case 4:
				System.out.println("Historial de operaciones:");
				imprimirHistorial(historial);
				break;

			default:
				if (opcion != 5) {
					System.out.println("Opción no válida");
				}
			}
		}

		return saldo; // único return
	}

	/**
	 * Registra una operación (ingreso o retiro) en el historial circular
	 */
	private static void registrarOperacion(String[] historial, int[] contadorHistorial, String tipo, double monto,
			double saldo) {
		historial[contadorHistorial[0] % historial.length] = tipo + " " + monto + " Saldo=" + saldo;
		contadorHistorial[0]++;
	}

	/**
	 * Imprime el historial de operaciones. Si no hay operación, imprime guiones.
	 */
	private static void imprimirHistorial(String[] historial) {
		for (String registro : historial) {
			if (registro != null) {
				System.out.println(registro);
			} else {
				System.out.println("-");
			}
		}
	}
}
