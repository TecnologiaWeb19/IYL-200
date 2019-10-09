package iyl.pkg200;

public class IYL200 {
    public static void main(String[] args) {
        mostrar("Maria", "Yujra", 123465, "01-01-2000", 50);
        mostrar("Kevin", "Calcina", 98654, "11-11-2100", 100);
    }
    
    public static void mostrar(String n, String a, int ci, String fn, int p){
        System.out.println("Tu nombre es: "+n);
        System.out.println("Tu Apellido es: "+a);
        System.out.println("Tu ci es: "+ci);
        System.out.println("Tu Fecha Nacimiento es: "+fn);
        System.out.println("Tu Peso es: "+p);
    }
}
