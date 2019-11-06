package vectores;

public class Ejemplo_2 {
    public static void main(String[] args) {
        //Declaracion de un Vector
        String[] nombre = new String[7];
        
        //Llenar datos al vector de forma manual
        nombre[0] = "Cristian";
        nombre[1] = "Hilario";
        nombre[2] = "Estela";
        nombre[3] = "Maria";
        nombre[4] = "Mariela";
        nombre[5] = "Ximena";
        nombre[6] = "Yhannet";
        
        //Mostra datos del vector
        System.out.print("["+nombre[0]+"]");
        System.out.print("["+nombre[1]+"]"); 
        System.out.print("["+nombre[2]+"]"); 
        System.out.print("["+nombre[3]+"]"); 
        System.out.print("["+nombre[4]+"]"); 
        System.out.print("["+nombre[5]+"]"); 
        System.out.print("["+nombre[6]+"]"); 
        System.out.println("");
    }
}
