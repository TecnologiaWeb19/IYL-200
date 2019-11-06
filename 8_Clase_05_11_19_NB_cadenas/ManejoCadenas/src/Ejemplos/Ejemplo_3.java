package Ejemplos;

public class Ejemplo_3 {

    public static void main(String[] args) {
        String letra = "hola amigos ";
        String letra2 = "como estan?";
        String unir = letra + letra2;
        System.out.println(unir);

        //Extraccion de caracteres
        System.out.println(letra.charAt(8));
        System.out.println(letra2.charAt(5));
        System.out.println(unir.charAt(14));
    }
}
