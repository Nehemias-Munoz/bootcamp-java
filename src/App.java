import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String cadena;
        String nuevaCadena = "";
        String[] cadenaDividida;
        System.out.println("Ingrese una cadena");
        cadena = scan.nextLine();
        scan.close();
        cadenaDividida = cadena.split("");
        for (int i = 0; i < cadenaDividida.length; i++) {
            if (cadenaDividida[i].toUpperCase() == cadenaDividida[i]) {
                cadenaDividida[i] = cadenaDividida[i].toLowerCase();
            } else {
                cadenaDividida[i] = cadenaDividida[i].toUpperCase();
            }
            nuevaCadena += cadenaDividida[i];
        }
        System.out.println("Cadena Inicial: " + cadena + " Cadena Formateada: " + nuevaCadena);
    }
}

// Nehemias Muñoz