package repaso;

public class Ejercicio03 {

	public static void main(String[] args) {

		String texto = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor";
		String[] palabras = { "lugar", "nombre", "cacatua", "lapiz", "hidalgo" };

		mostrarResultado(palabras);

	}

	static boolean contienePalabra(String texto, String palabra) {
		boolean contiene = false;
		texto = texto.toLowerCase();
		palabra = palabra.toLowerCase();
		if (texto.contains(palabra)) {
			contiene = true;
		}
		return contiene;
	}

	static String[] palabrasEncontradas(String texto, String[] claves) {
		String[] palabras;
		int cont = 0;

		for (int i = 0; i < claves.length; i++) {
			if (contienePalabra(texto, claves[i])) {
				cont++;
			}
		}
		palabras = new String[cont];

		for (int i = 0; i < claves.length; i++) {
			if (contienePalabra(texto, claves[i])) {
				palabras[i] = claves[i];
			}
		}

		return palabras;
	}

	static void mostrarResultado(String[] encontradas) {
		if (encontradas.length > 0) {
			System.out.println("Coinciden " + String.join(", ", encontradas));
		} else {
			System.out.println("No se ha encontrado ninguna palabra coincidente.");
		}
	}
}
