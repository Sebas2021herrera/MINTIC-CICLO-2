/*presentado por MICHAEL SEBASTIAN HERRERA CRISTIANO GRUPO 72 
Realizar un programa que calcule el sueldo de un trabajador,
el programa solicita el número de horas que has trabajado en un mes, las horas sepagan a $30.000*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int horaneta = 30000;
        float valor;
        System.out.println("INGRESE EL NUMERO DE HORAS TRABAJADAS: ");
        valor = (scanner.nextFloat())*horaneta;
        System.out.println("su sueldo es $"+valor);
        scanner.close();


    }
}
