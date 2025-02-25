package principal;
import java.util.Scanner;

public class Restaurante {
    private final Scanner scanner;
    private String tipoPedido;
    private double precio;
    private int cantidad;
    private String metodoPago;
    
    public Restaurante(Scanner scanner){
        this.scanner = scanner;
    }
    
    public void iniciarProcesos(){
        tomarDatos();
    }
    
    public void tomarDatos(){
        System.out.println("MENÚ DEL RESTAURANTE (P - Plato, B - Bebida)");
        System.out.print("Ingrese el tipo de pedido (P, B): ");
        tipoPedido = scanner.next().toUpperCase();
        
        System.out.print("Ingrese la cantidad: ");
        cantidad = scanner.nextInt();
        
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser un número positivo.");
            return;
        }
        
        establecerPrecio();
        seleccionarMetodoPago();
        calcularCosto();
    }
    
    public void establecerPrecio(){
        switch(tipoPedido){
            case "P":
                precio = 12.0;
                break;
            case "B":
                precio = 5.0;
                break;
            default:
                System.out.println("Tipo de pedido no válido.");
        }
    }
    
    public void seleccionarMetodoPago(){
        System.out.println("Métodos de pago disponibles: (E - Efectivo, T - Tarjeta, C - Cheque)");
        System.out.print("Ingrese el método de pago: ");
        metodoPago = scanner.next().toUpperCase();
    }
    
    public void calcularCosto(){
        double costoSinDescuento = precio * cantidad;
        double descuento;
        
        switch(metodoPago){
            case "E":
                descuento = costoSinDescuento * 0.10;
                break;
            case "T":
                descuento = costoSinDescuento * 0.05;
                break;
            case "C":
                descuento = 0;
                break;
            default:
                System.out.println("Método de pago no válido.");
                return;
        }
        
        double costoFinal = costoSinDescuento - descuento;
        
        System.out.println("Costo sin descuento: $" + costoSinDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Costo total a pagar: $" + costoFinal);
    }
    
}
