package principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int menu;
        Scanner objScanner = new Scanner(System.in);
        
        do{
            System.out.println("****MENU****");
            System.out.println("1. Ejercicio Ascensor");
            System.out.println("2. Ejercicio Ascensor/Peso");
            System.out.println("3. Ejercicio Sensor");
            System.out.println("4. Ejercicio Sensor/Ascensor");
            System.out.println("5. Ejercicio Tienda");
            System.out.println("6. Ejercicio Restaurante");
            System.out.println("7. Ejercicio Cajero Automatico");
            System.out.println("8. Ejercicio Viaje Coche");
            System.out.println("9. Ejercicio Cuenta Regresiva");
            System.out.println("10. Ejercicio Adivinanza");
            System.out.println("11. Ejercicio Registro Biblioteca");
            System.out.println("12. Ejercicio Menu Comidas");
            System.out.println("13. Ejercicio Promedio Examenes");
            System.out.println("14. Ejercicio Ventas");
            System.out.println("15. Ejercicio Parqueadero");
            System.out.println("16. Ejercicio Suma Numeros");
            System.out.println("17. Ejercicio Sistema Ventas");
            System.out.println("0. SALIR");
            System.out.print("DIGITE LA OPCION QUE DESEA -> ");
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
                
                case 5 -> {
                    Tienda objTienda = new Tienda(objScanner);
                    objTienda.iniciarProcesos();
                }
                case 6 -> {
                    Restaurante objRestaurante = new Restaurante(objScanner);
                    objRestaurante.iniciarProcesos();
                }
                case 7 -> {
                    CajeroAutomatico objCajero = new CajeroAutomatico(objScanner);
                    objCajero.iniciar();
                }
                case 8 -> {
                    ViajeEnCoche objViaje = new ViajeEnCoche(objScanner);
                    objViaje.iniciar();
                }
                
                case 9 -> {
                    CuentaRegresiva objCuenta = new CuentaRegresiva(objScanner);
                    objCuenta.iniciar();
                }
                case 10 -> {
                    Adivinanza objAdivina = new Adivinanza(objScanner);
                    objAdivina.iniciar();
                }
                case 11 ->{
                    RegistroBiblioteca objRegistro = new RegistroBiblioteca(objScanner);
                    objRegistro.iniciar();
                }
                case 12 -> {
                    MenuComidas objMenu = new MenuComidas(objScanner);
                    objMenu.iniciar();
                }
                case 13 -> {
                    PromedioExamenes objPromedio = new PromedioExamenes(objScanner);
                    objPromedio.iniciar();
                }
                case 14 -> {
                    RegistroVentas objVentas = new RegistroVentas(objScanner);
                    objVentas.iniciar();
                }
                case 15 -> {
                    RegistroParqueadero objParqueo = new RegistroParqueadero(objScanner);
                    objParqueo.iniciar();
                }
                case 16 -> {
                    SumaNumeros objSuma = new SumaNumeros(objScanner);
                    objSuma.iniciar();
                }
                case 17 -> {
                    SistemaVentas objSistema = new SistemaVentas(objScanner);
                    objSistema.iniciar();
                }
                default -> {
                }
            }
        }while(menu != 0);
    }
    
}
