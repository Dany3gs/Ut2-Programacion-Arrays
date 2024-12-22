/*1.- Realizar un programa que defina un vector llamado “vector_numeros” de 10 enteros, a
continuación lo inicialice con valores aleatorios (del 1 al 10) y posteriormente muestre en
pantalla cada elemento del vector junto con su cuadrado y su cubo.*/

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] vector_numeros = new int[10];

        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = (int) (Math.random() * 10 + 1);

            int cuadrado = vector_numeros[i] * vector_numeros[i];
            int cubo = vector_numeros[i] * vector_numeros[i] * vector_numeros[i];

            System.out.println("El número es " + vector_numeros[i] + ", su cuadrado es " + cuadrado + " y su cubo es " + cubo);
        }
    }
}

