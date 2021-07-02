import misClases.ClassCliente;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        int doc;
        String nom,ap,tel,em;
        ClassCliente miobjeto = new ClassCliente();  //Declaramos una variable del tipo de la clase
         Scanner sc = new Scanner(System.in);
         System.out.println("inserte documento: " );
         doc = sc.nextInt();
         System.out.println("inserte nombre: ");
         nom= sc.nextLine();
         System.out.println("inserte apellido: " );
         ap=sc.nextLine();
         System.out.println( "inserte telefono: " );
         tel=sc.nextLine();
         System.out.println( "inserte email: " );
         em=sc.nextLine();
        
    }
}
