import java.util.*;
public class deCentFar {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("inserte los grados: ");
        gradosC = sc.nextDouble();
        gradosF = 32 + (9*gradosC/5);
        System.out.println("F° =    "+ gradosF);
        sc.close();
    }
}
