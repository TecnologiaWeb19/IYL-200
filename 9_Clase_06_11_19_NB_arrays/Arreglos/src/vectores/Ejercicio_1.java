package vectores;

import java.util.Scanner;

public class Ejercicio_1 {
    static Scanner leer = new Scanner(System.in);
    //Tamaño de vector
    static int dimension = 6;

    public static void main(String[] args) {
        //Declaracion de un Vector
        int[] v = new int[dimension];
        
        Llenar(v);
        Mostrar(v);
        
    }

    public static void Llenar(int V[]) {
        //Llenar datos al vector dinamicamente
        for (int i = 0; i < dimension; i++) {
            if(i % 2 == 0){
                V[i] = 0;
            }else{
                V[i] = 1;
            }
        }
    }

    public static void Mostrar(int V[]) {
        //Mostrar datos del vector dinamicamente
        for (int i = 0; i < dimension; i++) {
            System.out.print("[" + V[i] + "]");
        }
    }
}
