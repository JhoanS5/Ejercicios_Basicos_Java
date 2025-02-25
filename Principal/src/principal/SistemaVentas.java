package principal;
import java.util.Scanner;

public class SistemaVentas {
    private final Scanner scanner;
    private double totalVentas;
    private final StringBuilder resumenVentas;

    public SistemaVentas(Scanner scanner) {
        this.scanner = scanner;
        this.totalVentas = 0;
        this.resumenVentas = new StringBuilder();
    }

    public void iniciar() {
        System.out.print("Ingrese la cantidad de productos vendidos: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("\nRegistro del producto " + i + ":");
            
            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Precio unitario: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Entrada no válida. Ingrese un precio válido: ");
                scanner.next();
            }
            double precio = scanner.nextDouble();

            System.out.print("Cantidad vendida: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada no válida. Ingrese una cantidad válida: ");
                scanner.next();
            }
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            double totalProducto = precio * cantidad;
            totalVentas += totalProducto;

            resumenVentas.append(i).append(". ").append(nombre)
                .append(" - Cantidad: ").append(cantidad)
                .append(" - Subtotal: $").append(totalProducto).append("\n");
        }

        mostrarResumen();
    }

    public void mostrarResumen() {
        System.out.println("\nResumen de ventas:");
        System.out.println(resumenVentas.toString());
        System.out.println("Total de ventas: $" + totalVentas);
        System.out.println("¡Gracias por su compra!");
    }
}
