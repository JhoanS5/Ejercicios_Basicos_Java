package principal;
import java.util.Scanner;
import java.time.LocalTime;

public class RegistroParqueadero {
    private final Scanner scanner;
    private final StringBuilder registroVehiculos;

    public RegistroParqueadero(Scanner scanner) {
        this.scanner = scanner;
        this.registroVehiculos = new StringBuilder();
    }

    public void iniciar() {
        System.out.print("Ingrese el número de vehículos a registrar: ");
        int cantidadVehiculos = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= cantidadVehiculos; i++) {
            System.out.print("Ingrese la placa del vehículo " + i + ": ");
            String placa = scanner.nextLine();
            LocalTime horaIngreso = LocalTime.now(); 

            
            registroVehiculos.append("Vehículo ").append(i)
                    .append(" - Placa: ").append(placa)
                    .append(" - Hora de ingreso: ").append(horaIngreso)
                    .append("\n");
        }

        mostrarResumen();
    }

    public void mostrarResumen() {
        System.out.println("\nResumen de vehículos registrados:");
        System.out.println(registroVehiculos.length() > 0 ? registroVehiculos : "No se registraron vehículos.");
    }
}
