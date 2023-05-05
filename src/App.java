import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int average = 0;
        int number;
        do {
            System.out.println("Ingrese un numero:");
            number = Integer.parseInt(scan.nextLine());
            if (number != 0) {
                numbers.add(number);
            }
        } while (number != 0);

        for (Integer integer : numbers) {
            average += integer;
        }

        average = Operaciones(numbers, average);
        numbers.removeIf(n -> (n % 2 == 0));

        for (Integer integer : numbers) {
            average += integer;
        }

        average = Operaciones(numbers, average);
    }

    private static int Operaciones(ArrayList<Integer> numbers, int average) {
        if (numbers.size() >= 3) {
            average = average / numbers.size();
            System.out.println("Promedio: " + average);
            Collections.sort(numbers);
            System.out.println("Val min:" + numbers.get(0));
            System.out.println("Valor max:" + numbers.get(numbers.size() - 1));
        } else {
            System.out.println("Numeros insuficiente para realizar operaciones");
        }
        return average;
    }
}

// Nehemias Muñoz