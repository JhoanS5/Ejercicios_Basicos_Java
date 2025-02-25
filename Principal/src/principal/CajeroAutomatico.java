package principal;
import java.util.Scanner;

public class CajeroAutomatico {
    private final Scanner scanner;
    private double saldo;
    
    public CajeroAutomatico(Scanner scanner){
        this.scanner = scanner;
        this.saldo = 1000000.0;
    }
    
    public void iniciar(){
        int opcion;
        do {
            System.out.println("\n*** CAJERO AUTOMÁTICO ***");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    retirarDinero();
                    break;
                case 0:
                    System.out.println("Gracias por usar el cajero automático.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es: $" + saldo);
    }
    
    public void retirarDinero(){
        System.out.print("Ingrese el monto a retirar: ");
        double monto = scanner.nextDouble();
        
        if (monto <= 0) {
            System.out.println("El monto debe ser mayor a cero.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo);
        }
    }
  
}
