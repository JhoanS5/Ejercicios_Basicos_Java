package principal;
import java.util.Scanner;

public class Tienda {
    private final Scanner Scanner;
    private String tipoProducto;
    private double precio;
    private int cantUnidades;
    
    public Tienda(Scanner Scanner){
        this.Scanner = Scanner;
    }
    
    public void iniciarProcesos(){
        tomarDatos();
    }
    
    public void tomarDatos(){
        System.out.println("TIENDA DE PRODUCTOS (A - Alimentos, V - Vestimenta, E - Electrónicos)");
        System.out.print("Ingrese el tipo de producto (A, V, E): ");
        tipoProducto = Scanner.next().toUpperCase();
        
        System.out.print("Ingrese la cantidad de unidades: ");
        cantUnidades = Scanner.nextInt();
        
        if (cantUnidades <= 0) {
            System.out.println("La cantidad debe ser un número positivo.");
            return;
        }
        
        establecerPrecio();
        calcularCosto();
    }
    
    public void establecerPrecio(){
        switch(tipoProducto){
            case "A" -> precio = 5000.0;
            case "V" -> precio = 20000.0;
            case "E" -> precio = 100000.0;
            default -> {
                System.out.println("Tipo de producto no válido.");
                return;
            }
        }
    }
    
    public void calcularCosto(){
        double costoSinDescuento = precio * cantUnidades;
        double descuento = 0;
        
        if (tipoProducto.equals("A")) {
            descuento = costoSinDescuento * 0.10;
        } else if (tipoProducto.equals("V")) {
            descuento = costoSinDescuento * 0.05;
        }
        
        double costoFinal = costoSinDescuento - descuento;
        
        System.out.println("Costo sin descuento: $" + costoSinDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Costo total a pagar: $" + costoFinal);
    }
}