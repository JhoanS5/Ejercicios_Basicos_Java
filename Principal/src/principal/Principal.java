
package principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int menu = 0;
        Scanner objScanner = new Scanner(System.in);
        
        do{
            System.out.println("****MENU****");
            System.out.println("1. Ejercicio Ascensor");
            System.out.println("2. Ejercicio Ascensor/Peso");
            System.out.println("3. Ejercicio Sensor");
            System.out.println("4. Ejercicio Sensor/Ascensor");
            System.out.println("0. SALIR");
            System.out.print("DIGITE LA OPCIÓN QUE DESEA -> ");
            menu = objScanner.nextInt();
            
            switch (menu){
                case 1 -> {
                    Ascensor objAscensor = new Ascensor(objScanner);  
                    objAscensor.iniciarProcesos();
                }
        
                case 2 -> {
                    AscensorPeso objAscensor = new AscensorPeso(objScanner);
                    objAscensor.iniciarProcesos();
                }
                
                case 3 -> {
                    SensorTemperatura objTemperatura = new SensorTemperatura(objScanner);
                    objTemperatura.iniciarProcesos();
                }
                
                case 4 -> {
                    SensorAscensor objSensorAscensor = new SensorAscensor(objScanner);
                    objSensorAscensor.iniciarProcesos();
                }
                default -> {
                }
            }
        }while(menu != 0);
    }
    
}
