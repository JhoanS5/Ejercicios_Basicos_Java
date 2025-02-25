package principal;
import java.util.Scanner;

public class SumaNumeros {
    private final Scanner scanner;
    private int sumaTotal;

    public SumaNumeros(Scanner scanner) {
        this.scanner = scanner;
        this.sumaTotal = 0;
    }

    public void iniciar() {
        System.out.print("Ingrese la cantidad de números a sumar: ");
        int cantidadNumeros = scanner.nextInt();

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            
           
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada no válida. Ingrese un número válido: ");
                scanner.next();
            }

            int numero = scanner.nextInt();
            sumaTotal += numero;
        }

        mostrarResultado();
    }

    public void mostrarResultado() {
        System.out.println("\nLa suma total de los números ingresados es: " + sumaTotal);
    }
}

