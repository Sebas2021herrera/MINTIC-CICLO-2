/* presentado por MICHAEL SEBASTIAN HERRERA CRISTIANO GRUPO 72
Pide por teclado el nombre, edad y salario y muestrael salario○
Si es menor de 16 no tiene edad para trabajar
○ Entre 19 y 50 años el salario es un 5 por ciento más
○ Entre 51 y 60 años el salario es un 10 por ciento más ○
Si es mayor de 60 el salario es un 15 por ciento más
*/
import java.util.*;
class Empleado{
    String nombre;
    int edad;
    float salario;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }

    public void resultadoSalario(){
            double salarioF=0;
        if (edad >=19 && edad <= 50) {
            salarioF = (salario*1.05);
        }
        else if (edad >=51 && edad <=60){

            salarioF = (salario*1.1);
        } else if (edad > 60){
            salarioF = (salario*1.15);
        }
        System.out.println("señor (a): "+nombre+" su salario final $"+salarioF);
    }
    
}
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int edad;
        Empleado em = new Empleado();
        System.out.println("ingrese nombre: ");
        em.setNombre(scanner.nextLine());
        System.out.println("Ingrese su Edad: ");
        edad = scanner.nextInt();

        if (edad >=19 && edad <= 50 || edad >=51 && edad <=60 || edad>60) {
            em.setEdad(edad);
            System.out.println("Digite su salario: ");
            em.setSalario(scanner.nextFloat());
            em.resultadoSalario();
            
        }
        else{

            System.out.println("su Edad no le permite trabajar");
        }
        scanner.close();
    }
}
