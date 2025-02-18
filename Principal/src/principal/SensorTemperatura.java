package principal;
import java.util.Scanner;
public class SensorTemperatura {
    private final Scanner Scanner;
    private int numTemperatura;
    
    public SensorTemperatura(Scanner Scanner){
        this.Scanner = Scanner;
    }
    
    public int getTemperatura(){
        return numTemperatura;
    }
    
    public void setTemperatura(int nuevaTemperatura){
        this.numTemperatura = nuevaTemperatura;
    }
    
    public void iniciarProcesos(){
        tomarDatos();
    }
    
    public void tomarDatos(){
        System.out.println("SENSOR TEMPERATURA (18°C y 25°C) ");
        System.out.println("Digite el piso al que desea ir.");
        setTemperatura(this.Scanner.nextInt());
        procesarDatos();
    }
    
    public void procesarDatos(){
        if (numTemperatura >= 18 && numTemperatura <= 25){
            System.out.println("TEMPERATURA Adecuada.");
        }else{
            System.out.println("TEMPERATURA Fuera del rango adecuado.");
        }
    }
}

