
package principal;

import java.util.Scanner;

public class AscensorPeso {
    
    private final Scanner Scanner;
    private int numPiso;
    private double pesoPersona;
    
    public AscensorPeso(Scanner Scanner){
        this.Scanner = Scanner;
    }
    
    public int getNumPiso(){
        return numPiso;
    }
    
    public void setNumPiso(int nuevoPiso){
        this.numPiso = nuevoPiso;
    }
    
    public double getPeso(){
        return pesoPersona;
    }
    
    public void setPeso(int nuevoPeso){
        this.pesoPersona = nuevoPeso;
    }
    
    public void iniciarProcesos(){
        tomarDatos();
    }
    
    public void tomarDatos(){
        System.out.println("ASCENSOR (Pisos:5 / Peso Max: 100kg) ");
        System.out.println("Digite el piso al que desea ir.");
        setNumPiso(this.Scanner.nextInt());
        System.out.println("Digite su peso.");
        setPeso(this.Scanner.nextInt());
        
        procesarDatos();
    }
    
    public void procesarDatos(){
        if (numPiso > 0 && numPiso <= 5){
            if (pesoPersona > 0 && pesoPersona <= 100){
                System.out.println("Moviendose al destino.");
            }else{
                System.out.println("Piso Valido / Peso Invalido.");
            }
        }else{
            System.out.println("Piso Inexistente");
        }
    }
}
