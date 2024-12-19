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

        double[] tempMax = {28, 30, 32, 34, 36};
        double[] tempMin = {-2, 4, 8, -12, 22};

        double media;

        for (int i = 0; i < tempMax.length; i++) {
              media = tempMax[i] + tempMin[i];
              media /= 2;

            System.out.println("La temperatura media de cada día es: " + media + " grados.");
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
                System.out.println("El día con menor temperatura es: " + menorTemp + " grados.");
            }
        }


        System.out.println("------------------------");
        System.out.println("Indique una temperatura:");

        double temp = sc.nextDouble();
        boolean existe = false;
        int indice = -1; // se inicializa en -1 para asegurar que no coincide con ninguna posición del array


        for (int i = 0; i < tempMax.length; i++) {
            if (tempMax[i] == temp) {
                existe = true;
                indice = i;
            }
        }

        if (existe) {
            System.out.println("La temperatura coincide con el día: " + (indice + 1));
        } else {
            System.out.println("No existe una temperatura con ese valor.");
        }
    }
}
//TODO pendiente comprobar que este correcto
