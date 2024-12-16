/*
* 2.- Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos
por el teclado. Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo
por la pantalla.*/
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique 5 palabras:");

        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i]= sc.nextLine();
        }

        String[] inverso = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            inverso[i] = array[array.length -1 -i];
        }

        System.out.println("Los elementos originales son: " + Arrays.toString(array));
        System.out.println("Los elementos a la inversa son: " + Arrays.toString(inverso));
    }
}
