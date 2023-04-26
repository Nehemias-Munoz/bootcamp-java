import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String contrasenia = "becaJava";
        String contraseniaUsuario = "";
        int nIntentos = 0;
        while (nIntentos < 3) {
            System.out.println("Ingrese contraseña: ");
            contraseniaUsuario = scan.nextLine();
            if (contrasenia.compareTo(contraseniaUsuario) == 0) {
                System.out.println("La clave ingresada es correcta");
                break;
            }
            nIntentos++;
        }
        scan.close();
    }
}
