package vectores;

import java.util.Scanner;

public class Ejemplo_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Tamaño de vector
        System.out.println("Introduzca la Cantidad de Estudiantes");
        int dimension = Integer.parseInt(leer.nextLine());

        //Declaracion de un Vector
        int[] edad = new int[dimension];
        String[] nombre = new String[dimension];

        //Llenar datos al vector dinamicamente
        for (int i = 0; i < dimension; i++) {
            System.out.println("Introduzca su Nombre: " + (i + 1));
            nombre[i] = leer.nextLine();
            System.out.println("Introduzca su Edad: " + (i + 1));
            edad[i] = Integer.parseInt(leer.nextLine());
        }

        //Mostrar datos del vector dinamicamente
        for (int i = 0; i < dimension; i++) {
            System.out.print("[" + nombre[i] + "]");
        }
        
        System.out.println("");
        for (int i = 0; i < dimension; i++) {
            System.out.print("[" + edad[i] + "]");
        }       
    }
}
