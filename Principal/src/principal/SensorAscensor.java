
package principal;
import java.util.Scanner;
        
public class SensorAscensor {
    private final Scanner Scanner;
    private int numPiso;
    private double numTemp;
    
    public SensorAscensor(Scanner Scanner){
        this.Scanner = Scanner;
    }
    
    public void iniciarProcesos(){
        this.tomarDatos();
    }
    
    public int getPiso(){
        return numPiso;
    }
    public void setPiso(int nuevoPiso){
        this.numPiso = nuevoPiso;
    }
    public double getTemp(){
        return numTemp;
    }
    public void setTemp(double nuevaTemp){
        this.numTemp = nuevaTemp;
    }
    
    public void tomarDatos(){
        System.out.println("Ascensor (Pisos #5)");
        setPiso(this.Scanner.nextInt());
        System.out.println("Temperatura");
        setTemp(this.Scanner.nextDouble());
        this.procesarDatos();
    }
    
    public void procesarDatos(){
        if (numPiso > 0 && numPiso <= 5){
            if (numTemp > 10 && numTemp <= 35){
                System.out.println("ASCENSOR EN MOVIMIENTO");
            }else{
                System.out.println("PISO ADECUADO / TEMPERATURA FUERA DE RANGO");
            }
        }else{
            System.out.println("PISO INEXISTENTE");
        }
    }
}
