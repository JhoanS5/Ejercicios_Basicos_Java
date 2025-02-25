package principal;
import java.util.Scanner;

public class CuentaRegresiva {
    private final Scanner scanner;
    
    public CuentaRegresiva(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void iniciar() {
        char continuar;
        do {
            ejecutarCuentaRegresiva();
            System.out.print("¿Desea realizar otra cuenta regresiva? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');
        
        System.out.println("¡Programa finalizado!");
    }
    
    public void ejecutarCuentaRegresiva() {
        System.out.print("Ingrese un numero entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
            return;
        }
        
        System.out.println("Iniciando cuenta regresiva:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("¡Tiempo cumplido!");
    }
}
