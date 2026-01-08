package cleancode;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		final double IVA = 0.21;
		final double DESCUENTO_SUPERIOR_100 = 0.1;
		final double DESCUENTO_SOCIO = 0.05;
		final int STOCK_MAX = 200; // Tamaño del stock global

		Scanner scanner = new Scanner(System.in);
		int[] stockGlobal = new int[STOCK_MAX];
		inicializarStock(stockGlobal, 10); // Stock inicial a 10 unidades

		System.out.println("¡Hola! Esto es una caja registradora");

		String continuar = "S";
		while (continuar.equalsIgnoreCase("S")) {
			// Pedir número de productos
			System.out.print("Número de productos? ");
			int numProductos = scanner.nextInt();
			scanner.nextLine();

			String[] nombres = new String[numProductos];
			double[] precios = new double[numProductos];
			int[] unidades = new int[numProductos];

			double total = 0;

			// Captura de datos de cada producto
			for (int i = 0; i < numProductos; i++) {
				System.out.print("Nombre producto: ");
				nombres[i] = scanner.nextLine();

				System.out.print("Precio: ");
				precios[i] = Math.abs(scanner.nextDouble()); // evita negativo
				System.out.print("Unidades: ");
				unidades[i] = scanner.nextInt();
				scanner.nextLine();

				if (unidades[i] <= 0)
					unidades[i] = 1; // mínimo 1 unidad

				total += precios[i] * unidades[i];

				// Actualizar stock usando un índice pseudoaleatorio
				int idxStock = calcularIndiceStock(nombres[i], i, STOCK_MAX);
				stockGlobal[idxStock] -= unidades[i];
				if (stockGlobal[idxStock] < 0) {
					System.out.println("Aviso: stock negativo, pero se continúa");
				}
			}

			// Comprobar si el cliente es socio
			System.out.print("Socio? (1=Sí / 0=No): ");
			int esSocio = scanner.nextInt();
			scanner.nextLine();

			// Aplicar descuentos
			double descuento1 = total > 100 ? total * DESCUENTO_SUPERIOR_100 : 0;
			double subtotal = total - descuento1;
			double descuento2 = (esSocio == 1) ? subtotal * DESCUENTO_SOCIO : 0;
			double baseImponible = subtotal - descuento2;
			double iva = baseImponible * IVA;
			double totalTicket = baseImponible + iva;

			// Imprimir ticket
			imprimirTicket(nombres, precios, unidades, total, descuento1, descuento2, baseImponible, iva, totalTicket);

			// Preguntar si se quiere procesar otra venta
			System.out.print("¿Otra venta? (S/N): ");
			continuar = scanner.nextLine();
			if (continuar.equalsIgnoreCase("N")) {
				System.out.println("Adiós");
			}
		}
	}

	/**
	 * Inicializa el stock global con un valor inicial
	 */
	private static void inicializarStock(int[] stock, int valorInicial) {
		for (int i = 0; i < stock.length; i++) {
			stock[i] = valorInicial;
		}
	}

	/**
	 * Calcula un índice pseudoaleatorio para actualizar el stock
	 */
	private static int calcularIndiceStock(String nombre, int i, int tamañoStock) {
		return (nombre.length() * 17 + i * 3) % tamañoStock;
	}

	/**
	 * Imprime el ticket de venta
	 */
	private static void imprimirTicket(String[] nombres, double[] precios, int[] unidades, double total,
			double descuento1, double descuento2, double baseImponible, double iva, double totalTicket) {
		System.out.println("=========== TICKET ===========");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("LIN " + i + " -> " + nombres[i] + " x" + unidades[i] + " @ " + precios[i] + " = "
					+ (unidades[i] * precios[i]));
		}
		System.out.println("SUBTOTAL = " + total);
		System.out.println("DESCUENTO 1 = " + descuento1);
		System.out.println("DESCUENTO 2 = " + descuento2);
		System.out.println("BASE IMPONIBLE = " + baseImponible);
		System.out.println("IVA = " + iva);
		System.out.println("TOTAL = " + totalTicket);
		System.out.println("===============================");
	}
}