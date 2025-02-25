package principal;
import java.util.Scanner;
import java.util.Random;

public class Adivinanza {
    private final Scanner scanner;
    private final Random random;
    
    public Adivinanza(Scanner scanner){
        this.scanner = scanner;
        this.random = new Random();
    }
    
    public void iniciar(){
        char continuar;
        do {
            jugar();
            System.out.print("¿Desea jugar otra vez? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');
        
        System.out.println("Gracias por jugar a la adivinanza.");
    }
    
    public void jugar(){
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        
        System.out.println("He pensado en un número entre 1 y 100. ¡Intenta adivinarlo!");
        
        while (true) {
            System.out.print("Introduce tu suposición: ");
            intento = scanner.nextInt();
            
            if (intento < numeroSecreto) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
                break;
            }
        }
    }
}
