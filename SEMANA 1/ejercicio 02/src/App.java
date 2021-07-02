//presentado por MICHAEL SEBASTIAN HERRERA CRISTIANO GRUPO 72

//Realizar un programa que realice el promedio de las notas de un alumno,para ello el programa va a tener que solicitar elnombre del alumno 
//y lasnotas de las 3 evaluaciones. Si el alumno tiene unpromedio mayor o igual a3.0 también debe imprimir “Aprobado”, si no alcanzóesa nota debe imprimir“Reprobado” 
//.Requisitos: Las notas que se ingresan pueden tener decimales.
import java.util.Scanner;
class Curso{
String Nombre;
float Promedio;

public void nombrar(String dato ){
   this.Nombre = dato;
}

public void promedio(float notas[]){
  float  contador = 0;
  for(int i = 0;i<notas.length;i++){
      contador +=notas[i];
  }
    this.Promedio = contador/notas.length;
}

public void resultado(){
    System.out.println("el estudiante "+Nombre + " esta: ");
    System.out.println((Promedio>=3)? "aprobado con:"+Promedio:"Reprobado con: "+ Promedio);
}
}


public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       Curso curso = new Curso();
       float [] notas = new float[3];  
        System.out.println("Digite Nombre del Estudiante: ");
        curso.nombrar(sc.nextLine());
        for (int i=0;i<notas.length;i++){
            System.out.println("inserte nota "+ (i+1)+": ");
            notas[i]=sc.nextFloat();
        }
        curso.promedio(notas);
        sc.close();
        curso.resultado();
        
    }
}
