public class App {
    public static void main(String[] args) throws Exception {
        //length(); charAt(n); substring(n1,n2); toUpperCase(); toLowerCase(); trim()
        String cadena = "El perro (Canis familiaris o Canis lupus familiaris dependiendo de si se lo considera una especie por derecho propio o una subespecie del lobo)";
        System.out.println(cadena.length()+"\n"+ cadena.charAt(40) + "\n"+cadena.substring(2,3)+"\n"+ cadena.toUpperCase() + "\n"+);
        System.out.println(cadena.charAt(40));
        System.out.println(cadena.substring(2,3));
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.trim());
            

    }
}
