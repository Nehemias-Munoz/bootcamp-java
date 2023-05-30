import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int cantVocales = 0;
        int cantConsonantes = 0;
        String cadena;
        char caracter;
        String vocales = "aeiou";
        Scanner scan = new Scanner(System.in);

        // Validamos que no se ingrese un parametro vacio o nulo
        do {
            System.out.println("Ingrese una palabra o cadena de texto:");
            cadena = scan.nextLine().trim();
        } while (cadena.isEmpty());

        // Ciclo con el largo de la cadena para verificar si lo que esta en la cadena es
        // una vocal o una consonante
        for (int i = 0; i < cadena.length(); i++) {
            cadena = cadena.toLowerCase();
            caracter = cadena.charAt(i);
            if (vocales.indexOf(caracter) != -1) {
                cantVocales++;
            } else if (Character.isLetter(caracter)) { // validamos si el caracter es una letra
                cantConsonantes++;
            }
        }
        System.out.println("La cantidad de vocales en la cadena son:" + cantVocales);
        System.out.println("La cantidad de consonantes en la cadena son:" + cantConsonantes);
    }
}

// Nehemias Muñoz