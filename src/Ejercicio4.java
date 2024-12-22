/*
* 4.- Crea un programa que declare un vector de diez elementos enteros y pida números para
rellenarlo hasta que se llene el vector o se introduzca un número negativo. Entonces se debe
imprimir el vector (sólo los elementos introducidos).*/

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        boolean continua = true;
        int contador = 0;

        System.out.println("Introduzca hasta 10 números positivos. O si desea parar, indique un número negativo.");

        // Rellenamos el array mientras no sea indicado un valor negativo
        for (int i = 0; i < array.length && continua; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = sc.nextInt();

            if (continua && array[i] >= 0) {
                contador++;
            }  else {
                continua = false;
            }
        }

        // Imprimimos los valores indicaos menos el último
        System.out.println("--------------------------");
        System.out.println("Las números indicados son: ");
        for (int i = 0; i < contador; i++) {
            if (i == contador -1 ) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        // Cerramos el Scanner
        sc.close();
    }
}
