package boletin2;

import java.util.Arrays;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Declarar variable
		int[] numeros;
		int tamaño = 0;
		int pos = 0;
		// Bucle para sacar el tamaño del array
		for(int i = 1; i <= 10; i++) {
			tamaño += i;
		}
		// Asigno el tamaño al array
		numeros = new int[tamaño];
		// Bucle para rellenar el array
		for (int i = 1; i <= 10; i++) {
			Arrays.fill(numeros, pos, pos + i, i);
			pos += i;
		}
		// Mostrar array
		System.out.println(Arrays.toString(numeros));
	}

}
