import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero1, numero2, resultado;
        String signo;
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Ingrese el primer numero:");
        numero1 = Integer.parseInt(scan.nextLine());
        System.out.println("Ingrese el segundo numero:");
        numero2 = Integer.parseInt(scan.nextLine());
        System.out.println(
                "Ingrese el simbolo operador:\n Suma(+)\n Resta(-)\n Multiplicacion(x) \n Division(:) \n Modulo(/)\n");
        signo = scan.nextLine();
        scan.close();
        switch (signo) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "x":
                resultado = numero1 * numero2;
                break;
            case ":":
                resultado = numero1 / numero2;
                break;
            case "/":
                resultado = numero1 % numero2;
                break;
            default:
                resultado = 0;
                break;
        }
        System.out.println("El resultado de la operacion es:" + resultado);
    }
}

// Nehemias Muñoz Monsalves