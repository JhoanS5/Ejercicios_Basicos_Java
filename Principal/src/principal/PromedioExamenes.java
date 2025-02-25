package principal;
import java.util.Scanner;

public class PromedioExamenes {
    private final Scanner scanner;
    private double sumaNotas;
    private int cantidadNotas;

    public PromedioExamenes(Scanner scanner) {
        this.scanner = scanner;
        this.sumaNotas = 0;
        this.cantidadNotas = 0;
    }

    public void iniciar() {
        char continuar;
        do {
            System.out.print("Ingrese la nota del examen: ");
            double nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 5) {
                sumaNotas += nota;
                cantidadNotas++;
            } else {
                System.out.println("Nota inválida. Debe estar entre 0 y 5.");
            }

            System.out.print("¿Desea ingresar otra nota? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();
        } while (continuar == 'S');

        if (cantidadNotas > 0) {
            double promedio = sumaNotas / cantidadNotas;
            System.out.printf("\nPromedio final: %.2f%n", promedio);
            if (promedio >= 3.0) { 
                System.out.println("¡Felicidades! Has aprobado.");
            } else {
                System.out.println("Lo siento, has reprobado.");
            }
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
}

