/*
* 5.- Hacer un programa que inicialice un vector de números con valores aleatorios, y posterior
ordene los elementos de menor a mayor.
(Usar la función Random. Para ello tendrán que hacer un trabajo de investigación de cómo funciona
y realizar el ejercicio)*/

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Importamos la clase Random, porque nos hace falta para rellenar los elementos como pide el ejercicio
        Random random = new Random();

        // Se usa valores de byte para no saturar la terminal con valores de int, que son muy altos, funcionaría
        // igual con un int.

        // Con (byte) (random.nextInt(Byte.MAX_VALUE ) + 1) estámos descartando valores negativos y 0 en la variable
        // que se usa para rellenar el array.

        byte numElementos = (byte) (random.nextInt(Byte.MAX_VALUE ) + 1);

        System.out.println("El número aleatorio para los elementos del array que ha salido es: " + numElementos);

        int[] arrayRandom = new int[numElementos];

        // Rellenamos los elementos del array con números aleatorios
        for (int i = 0; i < arrayRandom.length; i++) {

            // Generamos un número aleatorio del rango Byte (-128 a 127)
            int elemento = (byte) random.nextInt();
                arrayRandom[i] = elemento;
        }

       // Una opción para ordenar los elementos de menor a mayor es con el método sort de la clase Array.
       //Arrays.sort(arrayRandom);

        // Otra forma es con el método conocido como burbuja, el cual va sustituyendo la posición de los elementos
        // según la condición que le indiquemos.
        for (int i = 0; i < arrayRandom.length; i++) {
            for (int j = 0; j < arrayRandom.length - 1; j++) {
                if (arrayRandom[j] > arrayRandom[j + 1]) {

                    // Intercambio de valores
                    int aux = arrayRandom[j];
                    arrayRandom[j] = arrayRandom[j + 1];
                    arrayRandom[j + 1] = aux;
                }
            }
        }

        // Imprimimos los elementos ya ordenados
       System.out.println("El orden de menor a mayor es:");
       for (int i = 0; i < arrayRandom.length; i++) {
            System.out.println(arrayRandom[i]);
        }
    }
}
