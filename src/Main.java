/*1.- Realizar un programa que defina un vector llamado “vector_numeros” de 10 enteros, a
continuación lo inicialice con valores aleatorios (del 1 al 10) y posteriormente muestre en
pantalla cada elemento del vector junto con su cuadrado y su cubo.*/

public class Main {

    public static void main(String[] args) {

        int[] vector_numeros = new int[10];

        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = (int) (Math.random() * 10);

            int cuadrado = (int) Math.pow(vector_numeros[i], 2);
            int cubo = (int) Math.pow(vector_numeros[i], 3);

            System.out.println("El cuadrado del número " +vector_numeros[i] + " es " + cuadrado + " y su cubo es " + cubo);
        }
    }
}

