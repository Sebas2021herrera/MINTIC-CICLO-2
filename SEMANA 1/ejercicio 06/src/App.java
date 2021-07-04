/* presentado por MICHAEL SEBASTIAN HERRERA CRISTIANO GRUPO 72

Realiza un programa que solicite el sexo (H/M) y laaltura (cm) al usuario yque calcule 
el peso ideal.○peso ideal mujeres = altura - 120○peso ideal hombres = altura - 110
*/

import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingresa el sexo H para hombre M para mujer:");
        String Sexo = scanner.nextLine();
       while ((Sexo.equalsIgnoreCase("M")||Sexo.equalsIgnoreCase("H"))!= true ){
           System.out.println("Inserte corectamente el sexo, ** H para hombre M para mujer**");
            Sexo = scanner.nextLine();
       }
        System.out.println("inserte su Altura en CM: ");
        int Altura = scanner.nextInt();
        System.out.println((Sexo.equalsIgnoreCase("M")) ? "el peso ideal es: "+ (Altura-120) :"Su peso Ideal es: "+(Altura-110));
        scanner.close();
    }
}
