package cleancode;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final double IVA = 0.21;
		final double DESCUENTO_MAS_DE_100 = 0.10;
		final double DESCUENTO_POR_SOCIO = 0.05;
		final double UMBRAL_DESCUENTO = 100.0;
		final int TAM_STOCK = 200;
		final int STOCK_INICIAL = 10;

		boolean seguirComprando = true;

		int[] stock = inicializarStock(TAM_STOCK, STOCK_INICIAL);

		while (seguirComprando) {
			int numeroProductos = leerEnteroEnRango(scanner, "¿Cuántos productos vas a introducir?", 1, 50);

			String[] nombresProducto = new String[numeroProductos];
			double[] preciosProducto = new double[numeroProductos];
			int[] unidadesProducto = new int[numeroProductos];

			double subtotal = 0.0;

			for (int i = 0; i < numeroProductos; i++) {
				nombresProducto[i] = leerTextoNoVacio(scanner, "Nombre del producto " + (i + 1) + ":");

				preciosProducto[i] = leerDoubleMin(scanner, "Precio del producto " + (i + 1) + ":", 0.0);

				unidadesProducto[i] = leerEnteroEnRango(scanner, "Unidades del producto " + (i + 1) + ":", 1, 100);

				subtotal += preciosProducto[i] * unidadesProducto[i];

				int indexStock = obtenerIndexStock(nombresProducto[i], i, TAM_STOCK);
				actualizarStock(stock, indexStock, unidadesProducto[i]);
			}

			boolean esSocio = leerSiNo(scanner, "¿Es socio?");

			double[] totales = calcularTotales(subtotal, esSocio, UMBRAL_DESCUENTO, DESCUENTO_MAS_DE_100,
					DESCUENTO_POR_SOCIO, IVA);

			double descuentoSubtotal = totales[0];
			double descuentoSocio = totales[1];
			double baseImponible = totales[2];
			double importeIva = totales[3];
			double total = totales[4];

			imprimirTicket(nombresProducto, preciosProducto, unidadesProducto, subtotal, descuentoSubtotal,
					descuentoSocio, baseImponible, importeIva, total);

			seguirComprando = leerSiNo(scanner, "¿Quieres registrar otra compra?");
		}

		scanner.close();
	}

	private static int[] inicializarStock(int tamStock, int stockInicial) {
		int[] stock = new int[tamStock];
		for (int i = 0; i < stock.length; i++) {
			stock[i] = stockInicial;
		}
		return stock;
	}

	private static int leerEnteroEnRango(Scanner scanner, String mensaje, int min, int max) {
		int valor = 0;
		boolean valido = false;

		while (!valido) {

			System.out.println(mensaje);
			valor = scanner.nextInt();
			scanner.nextLine();

			if (valor < min || valor > max) {
				System.out.println("Error: el valor debe estar entre " + min + " y " + max + ".");
			} else {
				valido = true;
			}

		}

		return valor;
	}

	private static double leerDoubleMin(Scanner scanner, String mensaje, double min) {
		double valor = 0.0;
		boolean valido = false;

		while (!valido) {

			System.out.println(mensaje);
			valor = scanner.nextDouble();
			scanner.nextLine();

			if (valor < min) {
				System.out.println("Error: el valor debe ser mayor o igual que " + min + ".");
			} else {
				valido = true;
			}
		}
		return valor;
	}

	private static String leerTextoNoVacio(Scanner scanner, String mensaje) {
		String texto;

		while (true) {
			System.out.println(mensaje);
			texto = scanner.nextLine().trim();

			if (!texto.isEmpty()) {
				return texto;
			}

			System.out.println("Error: el texto no puede estar vacío.");
		}
	}

	private static boolean leerSiNo(Scanner scanner, String mensaje) {
		while (true) {
			System.out.println(mensaje + " (S/N)");
			String respuesta = scanner.nextLine().trim();

			if (respuesta.equalsIgnoreCase("S"))
				return true;
			if (respuesta.equalsIgnoreCase("N"))
				return false;

			System.out.println("Error: escribe solo S o N.");
		}
	}

	private static int obtenerIndexStock(String nombreProducto, int posicion, int tamStock) {
		return (nombreProducto.length() * 17 + posicion * 3) % tamStock;
	}

	private static void actualizarStock(int[] stock, int indexStock, int unidades) {
		stock[indexStock] -= unidades;
		if (stock[indexStock] < 0) {
			System.out.println("Aviso: stock negativo (simulación).");
		}
	}

	private static double[] calcularTotales(double subtotal, boolean esSocio, double umbral, double descSubtotal,
			double descSocio, double iva) {

		double descuento1 = subtotal > umbral ? subtotal * descSubtotal : 0.0;
		double subtotalConDescuento = subtotal - descuento1;

		double descuento2 = esSocio ? subtotalConDescuento * descSocio : 0.0;

		double baseImponible = subtotalConDescuento - descuento2;
		double importeIva = baseImponible * iva;
		double total = baseImponible + importeIva;

		return new double[] { descuento1, descuento2, baseImponible, importeIva, total };
	}

	private static void imprimirTicket(String[] nombres, double[] precios, int[] unidades, double subtotal,
			double descuento1, double descuento2, double baseImponible, double iva, double total) {

		System.out.println("=========== TICKET ===========");
		for (int i = 0; i < nombres.length; i++) {
			double linea = precios[i] * unidades[i];
			System.out.println((i + 1) + ") " + nombres[i] + "  " + unidades[i] + " x " + precios[i] + " = " + linea);
		}
		System.out.println("------------------------------");
		System.out.println("SUBTOTAL: " + subtotal);
		System.out.println("DESC > 100: " + descuento1);
		System.out.println("DESC SOCIO: " + descuento2);
		System.out.println("BASE: " + baseImponible);
		System.out.println("IVA: " + iva);
		System.out.println("TOTAL: " + total);
		System.out.println("==============================");
	}
}