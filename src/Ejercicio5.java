/*
* 5.- Hacer un programa que inicialice un vector de números con valores aleatorios, y posterior
ordene los elementos de menor a mayor.
(Usar la función Random. Para ello tendrán que hacer un trabajo de investigación de cómo funciona
y realizar el ejercicio)*/

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {

    public static void main(String[] args) {

        Random random = new Random();

        // Se usa valores de byte para no saturar la terminal con valores de int, que son muy altos, funcionaría
        // igual con un int.
        // Con ""(byte) (random.nextInt(Byte.MAX_VALUE ) + 1)"" estámos descartando valores negativos y 0.

        byte numElementos = (byte) (random.nextInt(Byte.MAX_VALUE ) + 1);

        System.out.println("El número aleatorio para los elementos del array que ha salido es: " + numElementos);

        int[] arrayRandom = new int[numElementos];

        // Rellenamos los elementos con números aleatorios
        for (int i = 0; i < arrayRandom.length; i++) {
            int elemento = (byte) Math.abs(random.nextInt()); // Aquí sí pueden ser negativos o 0.
                arrayRandom[i] = elemento;
        }

       // Con el método sort de la clase Array nos ordena el array de menor a mayor.
       Arrays.sort(arrayRandom);

       System.out.println("El orden de menor a mayor es:");
       for (int i = 0; i < arrayRandom.length; i++) {
            System.out.println(arrayRandom[i]);
        }
    }
}
