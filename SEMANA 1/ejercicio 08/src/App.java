/* presentado por MICHAEL SEBASTIAN HERRERA CRISTIANO GRUPO 72
Realizar un programa que permita controlar el juegode piedra, papel,
 tijeraintroduciendo P para piedra, L para papel y T paratijera por cada jugador.
 El sistema debe indicar qué jugador gana la ronda o si hay empate. 
 Al finalde cada ronda preguntar si desea volver a jugar.
*/
import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String [] vector = new String[2];
        String piedra = "p";
        String papel = "l";
        String tijera = "t";
        System.out.println("JUEGO DE PIEDRA, PAPEL O TIJERA (P , L , T)");

        for (int i = 0; i <vector.length; i++) {

            System.out.println("Jugador " + (i+1)+" ingrese: ");
            vector[i]=scanner.nextLine();
        }
        for (int i = 0; i <vector.length; i++) {

          if (vector[i].equals(vector[i+1])) {

            System.out.println("***EMPATE***  para jugador "+(i+1) + ": "+vector[i]+" jugador "+(i+2)+": "+vector[i+1]);
            break;
        }
        else if (vector[i].equalsIgnoreCase(piedra)&&vector[i+1].equalsIgnoreCase(tijera)||vector[i].equalsIgnoreCase(papel)&&vector[i+1].equalsIgnoreCase(piedra)||vector[i].equalsIgnoreCase(tijera)&&vector[i+1].equalsIgnoreCase(papel)) {
            System.out.println("GANA JUGADOR "+(i+1));
            break;  
        }
        else if (vector[i].equalsIgnoreCase(tijera)&&vector[i+1].equalsIgnoreCase(piedra)||vector[i].equalsIgnoreCase(piedra)&&vector[i+1].equalsIgnoreCase(papel)||vector[i].equalsIgnoreCase(papel)&&vector[i+1].equalsIgnoreCase(tijera)) {
            System.out.println("GANA JUGADOR "+(i+2));
            break;  
        }
        
        }

    }
}
