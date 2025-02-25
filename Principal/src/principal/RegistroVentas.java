package principal;
import java.util.Scanner;

public class RegistroVentas {
    private final Scanner scanner;
    private double totalVentas;
    private final StringBuilder resumenVentas;

    public RegistroVentas(Scanner scanner) {
        this.scanner = scanner;
        this.totalVentas = 0;
        this.resumenVentas = new StringBuilder();
    }

    public void iniciar() {
        char continuar;
        do {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            if (precio >= 0) {
                totalVentas += precio;
                resumenVentas.append(producto).append(": $").append(precio).append(" COP\n");
            } else {
                System.out.println("Precio inválido. Intente nuevamente.");
            }

            System.out.print("¿Desea registrar otro producto? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine(); 

        } while (continuar == 'S');

        mostrarResumen();
    }

    public void mostrarResumen() {
        System.out.println("\nResumen de Ventas:");
        System.out.println(resumenVentas.length() > 0 ? resumenVentas : "No se registraron ventas.");
        System.out.println("Total de ventas: $" + totalVentas + " COP");
    }
}

