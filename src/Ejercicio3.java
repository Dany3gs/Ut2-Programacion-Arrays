/*
* 3.- Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
(comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota
más alta que ha sacado y la menor.*/


import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indique las notas obtenidas.");

        int[] notas = new int[5];
        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            boolean notaValida = false;
                while (!notaValida) {   //mientras no sea válido el valor introducido no salimos de bucle while
                    notas[i] = sc.nextInt(); //rellenamos array desde teclado

                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Indique un valor entre 0 y 10");
                } else {
                    total += notas[i];
                    notaValida = true;
                }
            }
        }

        //Imprimimos los elementos separados por ", ". él último no.
        System.out.println("Las notas indicadas son: ");
        for (int i = 0; i < notas.length; i++) {
            if (i == notas.length -1 ) {
                System.out.print(notas[i]);
            } else {
                System.out.print(notas[i] + ", ");
            }
        }

        int mayor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            mayor = Math.max(mayor,notas[i]);
        }

        int menor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            menor = Math.min(menor, notas[i]);
        }

        System.out.println("");
        System.out.println("La nota media es: " + total / notas.length);
        System.out.println("La nota máxima es: " + mayor);
        System.out.println("La nota menor es: " + menor);

        // Cerramos el Scanner
        sc.close();
    }
}
