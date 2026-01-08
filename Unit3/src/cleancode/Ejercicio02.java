package cleancode;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Opciones del menú (solo visibles en main)
		final int OPCION_CARGAR = 1;
		final int OPCION_VER = 2;
		final int OPCION_MEDIA_ALUMNO = 3;
		final int OPCION_MEDIA_MODULO = 4;
		final int OPCION_MIN_MAX = 5;
		final int OPCION_SALIR = 6;

		Scanner sc = new Scanner(System.in);
		double[][] notas = null;
		boolean hayDatos = false;
		int opcion;

		System.out.println("Gestor de notas");

		do {
			mostrarMenu();
			opcion = sc.nextInt();

			switch (opcion) {
			case OPCION_CARGAR:
				// Carga las notas y habilita el resto de opciones
				notas = cargarNotas(sc);
				hayDatos = true;
				break;

			case OPCION_VER:
				// Muestra todas las notas almacenadas
				comprobarDatos(hayDatos);
				imprimirNotas(notas);
				break;

			case OPCION_MEDIA_ALUMNO:
				// Calcula la media de cada alumno
				comprobarDatos(hayDatos);
				mostrarMediaPorAlumno(notas);
				break;

			case OPCION_MEDIA_MODULO:
				// Calcula la media de cada módulo
				comprobarDatos(hayDatos);
				mostrarMediaPorModulo(notas);
				break;

			case OPCION_MIN_MAX:
				// Muestra la nota mínima y máxima del conjunto
				comprobarDatos(hayDatos);
				mostrarMinMax(notas);
				break;

			case OPCION_SALIR:
				System.out.println("Saliendo...");
				break;

			default:
				// Opción no contemplada en el menú
				System.out.println("Opción no válida");
			}

		} while (opcion != OPCION_SALIR);
		// Cerrar scanner
		sc.close();
	}

	/**
	 * Muestra el menú de opciones por pantalla
	 */
	private static void mostrarMenu() {
		System.out.println("1 Cargar  2 Ver  3 Media Alumno  4 Media Módulo  5 Min/Max  6 Salir");
	}

	/**
	 * Solicita al usuario el número de alumnos y módulos y devuelve la matriz de
	 * notas ya normalizadas
	 */
	private static double[][] cargarNotas(Scanner scanner) {
		System.out.print("Número de alumnos: ");
		int alumnos = scanner.nextInt();

		System.out.print("Número de módulos: ");
		int modulos = scanner.nextInt();

		double[][] notas = new double[alumnos][modulos];

		for (int i = 0; i < alumnos; i++) {
			for (int j = 0; j < modulos; j++) {
				System.out.print("Nota alumno " + i + " módulo " + j + ": ");
				notas[i][j] = normalizarNota(scanner.nextDouble());
			}
		}
		return notas;
	}

	/**
	 * Asegura que la nota esté dentro del rango permitido
	 */
	private static double normalizarNota(double nota) {
		final double NOTA_MINIMA = 0.0;
		final double NOTA_MAXIMA = 10.0;

		if (nota < NOTA_MINIMA)
			return NOTA_MINIMA;
		if (nota > NOTA_MAXIMA)
			return NOTA_MAXIMA;
		return nota;
	}

	/**
	 * Imprime la matriz completa de notas
	 */
	private static void imprimirNotas(double[][] notas) {
		for (double[] alumno : notas) {
			for (double nota : alumno) {
				System.out.print(nota + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Calcula y muestra la media de cada alumno
	 */
	private static void mostrarMediaPorAlumno(double[][] notas) {
		for (int i = 0; i < notas.length; i++) {
			double suma = 0;
			for (double nota : notas[i]) {
				suma += nota;
			}
			System.out.println("Alumno " + i + ": " + suma / notas[i].length);
		}
	}

	/**
	 * Calcula y muestra la media de cada módulo
	 */
	private static void mostrarMediaPorModulo(double[][] notas) {
		for (int j = 0; j < notas[0].length; j++) {
			double suma = 0;
			for (double[] alumno : notas) {
				suma += alumno[j];
			}
			System.out.println("Módulo " + j + ": " + suma / notas.length);
		}
	}

	/**
	 * Busca y muestra la nota mínima y máxima
	 */
	private static void mostrarMinMax(double[][] notas) {
		double minimo = Double.MAX_VALUE;
		double maximo = Double.MIN_VALUE;

		for (double[] alumno : notas) {
			for (double nota : alumno) {
				minimo = Math.min(minimo, nota);
				maximo = Math.max(maximo, nota);
			}
		}
		System.out.println("Mínimo = " + minimo + " | Máximo = " + maximo);
	}

	/**
	 * Evita ejecutar opciones si no se han cargado datos
	 */
	private static void comprobarDatos(boolean hayDatos) {
		if (!hayDatos) {
			throw new IllegalStateException("No hay datos cargados");
		}
	}
}
