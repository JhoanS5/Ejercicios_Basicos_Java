package principal;
import java.util.Scanner;

public class ViajeEnCoche {
    private final Scanner scanner;
    
    public ViajeEnCoche(Scanner scanner){
        this.scanner = scanner;
    }
    
    public void iniciar(){
        char continuar;
        do {
            calcularTiempoViaje();
            System.out.print("¿Desea realizar otro viaje? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');
        
        System.out.println("Gracias por usar el simulador de viaje.");
    }
    
    public void calcularTiempoViaje(){
        System.out.print("Ingrese la distancia total del viaje en km: ");
        double distancia = scanner.nextDouble();
        
        System.out.print("Ingrese la velocidad promedio del coche en km/h: ");
        double velocidad = scanner.nextDouble();
        
        if (distancia <= 0 || velocidad <= 0) {
            System.out.println("La distancia y la velocidad deben ser valores positivos.");
            return;
        }
        
        double tiempo = distancia / velocidad;
        System.out.printf("El tiempo estimado de viaje es: %.2f horas%n", tiempo);
    }
}