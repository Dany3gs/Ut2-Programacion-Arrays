/*
* 9.- Queremos guardar la temperatura mínima y máxima de 5 días. Realiza un programa que de la
siguiente información:
• La temperatura media de cada día
• Los días con menos temperatura
• Se lee una temperatura por teclado y se muestran los días cuya temperatura máxima
coincide con ella. si no existe ningún día se muestra un mensaje de información.*/


import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] tempMax = {28.7, 30.0, 32.7, 30.0, 32.7};
        double[] tempMin = {-2.3, 4.0, 8, -12, 12};

        double media;

        // Calculamos la media por día.
        System.out.println("La temperatura media de cada día es: ");
        System.out.println("------------------------------------");
        for (int i = 0; i < tempMax.length; i++) {
            media = (tempMax[i] + tempMin[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media + " grados.");
        }

        // Localizamos la menor temperatura del array minTemp.
        double menorTemp = tempMin[0];

        for (int i = 1; i < tempMin.length; i++) {

            // Cambiamos valores para localizar el menor
            if (tempMin[i] < menorTemp) {
                menorTemp = tempMin[i];
            }
        }

        // La mostramos en consola
        for (int i = 0; i < tempMin.length; i++) {
            if (tempMin[i] == menorTemp) {
                System.out.println("----------------------------------------------------------");
                System.out.println("El día " + i + " es el día con menor temperatura: " + menorTemp + " grados.");
            }
        }

        // Solicitamos valor para comparar
        System.out.println("------------------------");
        System.out.println("Indique una temperatura:");

        double temp = sc.nextDouble();
        boolean existe = false;
        double[] indice = new double[5]; // Se guardan valores que coincidan en nuevo array.

        // Si el valor coincide, sustituimos valor.
        for (int i = 0; i < tempMax.length; i++) {
            if (tempMax[i] == temp) {
                existe = true;
                indice[i] = tempMax[i];
            }
        }

        // Imprimimos según cumpla la condición.
        for (int i = 0; i < indice.length; i++) {
            if (indice[i] == temp) {
                System.out.println("La temperatura coincide con el día "+ (i + 1) + ": " + indice[i] + " grados.");
            } else if (!existe){
                System.out.println("No existe una temperatura con ese valor.");
            }
        }
    }
}
