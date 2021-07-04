/* Presentado por MICHAEL SEBASTIAN HERRERA CRISTIANO GRUPO 72
Solicitar un número al usuario y mostrar la tablade multiplicar de esenúmero,
 desde el 0 hasta el 10.Truco: Usa un bucleforpara recorrer latabla y mostrar los datos */
import java.util.Scanner;
 public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE EL NUMERO QUE DESEA VER EN LA TABLA DE MULTIPLICAR: ");
        int numero = scanner.nextInt();

        for (int i = 0; i <=10; i++) {

            System.out.println(numero+" x "+i+" = "+(numero*i));
        }
        scanner.close();
    }
}
