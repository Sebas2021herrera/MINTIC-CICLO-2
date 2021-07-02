//presntado por MICHAEL SEBASTIAN HERRERA GRUPO 72
//Realizar la suma, la resta, la división y la multiplicaciónde dos númerosleídos por teclado
// y mostrar en pantalla “La<operación>de<número 1>y<número 2>es igual a<resultado>”.
import java.util.Scanner;

class operaciones{
double suma;
double resta;
double multi;
double divi;

public void sumar(double uno, double dos){
    this.suma = uno + dos;
}
public void restar(double uno, double dos){

    this.resta = uno - dos;
}
public void multiplicar(double uno, double dos){

    this.multi = uno * dos;
}
public void dividir(double uno, double dos){

    this.divi = uno / dos;
}
public void resultado(double uno, double dos){
    System.out.println("la suma de "+ uno +" y "+ dos + "="+ suma+"\n");
    System.out.println("la resta de "+ uno +" y "+ dos + "="+ resta+"\n");
    System.out.println("la multiplicacion de "+ uno +" y "+ dos + "="+ multi+"\n");
    System.out.println("la division de "+ uno +" y "+ dos + "="+ divi+"\n");
}

}
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        operaciones op = new operaciones(); //instancia de la clase
        double primer, segundo;
        System.out.println("inserte primer numero:");
        primer = scanner.nextDouble();
        System.out.println("inserte segundo numero:");
        segundo = scanner.nextDouble();
        op.sumar(primer, segundo); //se envia datos al metodo que corresponda
        op.restar(primer, segundo);
        op.multiplicar(primer, segundo);
        op.dividir(primer, segundo);
        op.resultado(primer, segundo); // se llama metodo de impresion
        scanner.close();
        
    }
}
