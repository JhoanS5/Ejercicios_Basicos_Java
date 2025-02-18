
package principal;
import java.util.Scanner;

public class Ascensor {
    
    private final Scanner Scanner;
    private int numPiso;
    
    public Ascensor(Scanner Scanner){
        this.Scanner = Scanner;
    }
    
    public int getNumPiso(){
        return numPiso;
    }
    
    public void setNumPiso(int nuevoPiso){
        this.numPiso = nuevoPiso;
    }
    
    public void iniciarProcesos(){
        tomarDatos();
    }
    
    public void tomarDatos(){
        System.out.println("ASCENSOR (SENA #Pisos:5) ");
        System.out.println("Digite el piso al que desea ir.");
        setNumPiso(this.Scanner.nextInt());
        procesarDatos();
    }
    
    public void procesarDatos(){
        if (numPiso > 0 && numPiso <= 5){
            System.out.println("Moviendose al destino.");
        }else{
            System.out.println("Piso Inexistente");
        }
    }
}
