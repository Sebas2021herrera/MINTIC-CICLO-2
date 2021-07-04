/* presentado por MICHAEL SEBASTIAN HERRERA CRISTIANO GRUPO 72
Generar un número aleatorio entre el 1 y el 100, elusuario lo tiene queadivinar introduciendo
 el número por teclado. En elcaso que el número aadivinar sea mayor al ingresado, decirle
  al usuario“El número que busca esmayor”, de lo contrario, “El número que busca es menor”.
  El programafinalizará cuando se introduzca el número correcto.Nota: usar la claseRandom para generar el número aleatorio.
*/
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int aleatorio = rand.nextInt(100);
        
        System.out.println("se ha generado un numero aleatorio del 1 al 100, adivinelo ");
        int entrada = 0;
        while (aleatorio != (entrada = scanner.nextInt())){

            if(entrada > aleatorio){
                System.out.println("el numero Aleatorio es menor sigue intentando");
            }
            else{
                System.out.println("el numero Aleatorio es mayor, sigue intentando");
            }
        }
        System.out.println("si llegaste aqui acertaste, felicitaciones");
    }
}
