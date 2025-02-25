package principal;
import java.util.Scanner;

public class RegistroBiblioteca {
    private final Scanner scanner;
    private final StringBuilder librosRegistrados;
    
    public RegistroBiblioteca(Scanner scanner){
        this.scanner = scanner;
        this.librosRegistrados = new StringBuilder();
    }
    
    public void iniciar(){
        char continuar;
        do {
            registrarLibro();
            System.out.print("¿Desea registrar otro libro? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine(); 
        } while (continuar == 'S');
        
        System.out.println("\nLista de libros registrados:");
        System.out.println(librosRegistrados.toString());
    }
    
    public void registrarLibro(){
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        
        System.out.print("Ingrese el número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine();
        
        librosRegistrados.append("Título: ").append(titulo)
                        .append(", Autor: ").append(autor)
                        .append(", Páginas: ").append(paginas)
                        .append("\n");
        
        System.out.println("Libro registrado con éxito.\n");
    }
}
