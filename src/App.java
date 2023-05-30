import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String cadena;
        char[] arrayCadena;
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        int coincidencia = 0;
        // Comprobamos la cadena no sea vacia o null
        do {
            cadena = JOptionPane.showInputDialog(null, "Ingrese una cadena de texto");
            cadena = cadena.trim();
        } while (cadena.isBlank());

        arrayCadena = new char[cadena.length()];
        arrayCadena = cadena.toCharArray();

        for (int i = 0; i < abecedario.length(); i++) {
            for (char caracter : arrayCadena) {
                // Validamos si el caracter en la lista es igual al caracter en el abcedario
                if (Character.toString(abecedario.charAt(i))
                        .compareTo(Character.toString(caracter).toLowerCase()) == 0) {
                    coincidencia++;
                }
            }
            System.out.println(abecedario.charAt(i) + ": " + coincidencia);
            coincidencia = 0;
        }

    }
}

// Nehemias Muñoz