/* presentado por MICHAEL SEBASTIAN HERRERA CRISTIANO GRUPO 72
Pedir un número, comprobar si es primo y preguntarsi quiere introducir más(S/N) y volver a pensa
*/
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            String dato="";
            System.out.println("Digite un numero: ");
            numero = scanner.nextInt();
            if(esPrimo(numero)==true){
                System.out.println("el numero "+ numero + "es Primo"+"\n");
                System.out.println("Desea seguir S/N");
                 dato = scanner.nextLine();

            }
            else
            {
                System.out.println("el numero "+ numero + "NO es Primo"); 
           
            }
            
            

        } while (dato.equalsIgnoreCase("n")!=true);
    }
    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
          if (numero % contador == 0)
            primo = false;
          contador++;
        }
        return primo;
      }
}
