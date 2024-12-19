/*
* 7.- Crea un programa que declare tres vectores ‘vector1’, ‘vector2’ y ‘vector3’ de cinco enteros
cada uno, pida valores para ‘vector1’ y ‘vector2’ y calcule vector3=vector1+vector2. Para ello hay
que sumar cada una de las posiciones.*/

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        System.out.println("Rellene vector 1:");
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = sc.nextInt();
        }

        System.out.println("Rellene vector 2:");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = sc.nextInt();
        }

        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("La suma de los elementos del vector1 y vector2 son: ");
        for (int i = 0; i < vector3.length; i++) {
            System.out.print(vector3[i] + " ");
        }

    }
}
