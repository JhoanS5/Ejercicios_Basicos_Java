package principal;
import java.util.Scanner;

public class MenuComidas {
    private final Scanner scanner;
    private double totalCosto;
    
    public MenuComidas(Scanner scanner){
        this.scanner = scanner;
        this.totalCosto = 0;
    }
    
    public void iniciar(){
        char continuar;
        do {
            mostrarMenu();
            System.out.print("¿Desea realizar otro pedido? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine(); // Limpiar buffer
        } while (continuar == 'S');
        
        System.out.println("\nTotal a pagar: $" + totalCosto + " COP");
        System.out.println("¡Gracias por su compra!");
    }
    
    public void mostrarMenu(){
        System.out.println("\nMenú de Comidas Rápidas:");
        System.out.println("1. Hamburguesa - $20000 COP");
        System.out.println("2. Pizza - $32000 COP");
        System.out.println("3. Hot Dog - $14000 COP");
        System.out.println("4. Papas Fritas - $8000 COP");
        System.out.println("5. Refresco - $6000 COP");
        System.out.print("Seleccione una opción: ");
        
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1 -> totalCosto += 20000;
            case 2 -> totalCosto += 32000;
            case 3 -> totalCosto += 14000;
            case 4 -> totalCosto += 8000;
            case 5 -> totalCosto += 6000;
            default -> System.out.println("Opción inválida. Intente nuevamente.");
        }
    }
}
