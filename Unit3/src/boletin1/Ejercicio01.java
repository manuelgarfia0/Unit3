package boletin1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Crear random
		Random rd = new Random();
		// Declarar variable
		int[] numerosAleatorios = new int[10];
		// Bucle para añadir al array numeros aleatorios
		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = rd.nextInt(1, 101);
		}
		// Muestro el array
		System.out.println(Arrays.toString(numerosAleatorios));
	}

}
