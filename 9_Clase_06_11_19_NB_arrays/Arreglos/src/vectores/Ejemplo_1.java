package vectores;

public class Ejemplo_1 {
    public static void main(String[] args) {
        //Declaracion de un Vector
        int[] edad = new int[7];
        
        //Llenar datos al vector de forma Manual
        edad[0] = 12;
        edad[1] = 22;
        edad[2] = 24;
        edad[3] = 25;
        edad[4] = 11;
        edad[5] = 12;
        edad[6] = 17;
        
        //Mostra datos del vector
        System.out.print("["+edad[0]+"]");
        System.out.print("["+edad[1]+"]"); 
        System.out.print("["+edad[2]+"]"); 
        System.out.print("["+edad[3]+"]"); 
        System.out.print("["+edad[4]+"]"); 
        System.out.print("["+edad[5]+"]"); 
        System.out.print("["+edad[6]+"]"); 
        System.out.println("");
        
        //12 - 25 - 17
        System.out.print("["+edad[0]+"]"+"["+edad[3]+"]"+"["+edad[6]+"]");
        System.out.println("");
        int suma = edad[0] + edad[3] + edad[6];
        System.out.println("La suma es: " + suma);
    }
}
