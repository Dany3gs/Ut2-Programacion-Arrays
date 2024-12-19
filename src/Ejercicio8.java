/*
* 8.- Queremos guardar los nombres y las edades de los alumnos de un curso. Realiza un programa
que introduzca el nombre y la edad de cada alumno (2 Arrays distintos). El proceso de lectura de
datos terminará cuando se introduzca como nombre un asterisco (*) Al finalizar se mostrará los
siguientes datos:
• Todos los alumnos mayores de edad.
• Los alumnos mayores (los que tienen más edad)*/

/*--------------------------------------------------------------------------*/
/*En este ejercicio no me quedó claro como abordarlo con arrays, ya que estos
  tienen un tamaño fijo que debe ser especificado al declararlos, investigando,
  vi que los ArrayList se ajustaban más a lo requerido, porque no sabemos cuando
  se va a terminar de rellenar los elementos.

  En un principio, he realizado el ejercicio con Arraylist (dejo el código comentado
  debajo) y para presentarlo con la opción con arrays, lo he adaptado con un contador
  y he indicado un tamaño de 50 elementos.
*/
/*--------------------------------------------------------------------------*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[50];
        int[] edades = new int[50];
        int contador = 0;

        System.out.println("Indique su nombre y edad (introduzca '*' para finalizar):");

        // Rellenamos los arrays con los datos del usuario
        while (true) {
            System.out.print("Su nombre? ");
            String nombre = sc.nextLine();

            if (nombre.equals("*")) {
                break;
            }
            nombres[contador] = nombre;

            System.out.print("Su edad? ");
            int edad = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            edades[contador] = edad;

            contador++;

            if (contador == 50) {
                System.out.println("Se ha alcanzado el límite máximo de 100 alumnos.");
                break;
            }
        }

        // Imprimimos los alumnos mayores de edad
        System.out.println("--------------------------------");
        System.out.println("Los alumnos mayores de edad son:");
        System.out.println("--------------------------------");

        for (int i = 0; i < contador; i++) {
            if (edades[i] >= 18) {
                System.out.printf("%s con %d años %n", nombres[i], edades[i]);
            }
        }

        // Encontramos la mayor edad
        int mayorEdad = Integer.MIN_VALUE;
        for (int i = 0; i < contador; i++) {
            if (edades[i] > mayorEdad) {
                mayorEdad = edades[i];
            }
        }

        // Imprimimos los alumnos con la mayor edad
        System.out.println("---------------------------------------");
        System.out.println("El alumno o alumnos con mayor edad son:");
        System.out.println("---------------------------------------");

        for (int i = 0; i < contador; i++) {
            if (edades[i] == mayorEdad) {
                System.out.printf("%s con %d años %n", nombres[i], edades[i]);
            }
        }

        // Cerramos el Scanner
        sc.close();
    }
}
/*
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean salir = true;

        System.out.println("Indique su nombre y edad");

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        // Rellenamos ArrayList e indicamos valor "*" para finalizar.
        while (salir) {
            System.out.println("Su nombre? ");
            String nombre = sc.nextLine();

            if (nombre.equals("*")) {
                salir = false;
                continue;
            }
            nombres.add(nombre);

            System.out.println("Su edad? ");
            int edad = sc.nextInt();
            sc.nextLine();
            edades.add(edad);
        }

        //  Imprimimos los alumnos mayores de edad
        System.out.println("--------------------------------");
        System.out.println("Los alumnos mayores de edad son:");
        System.out.println("--------------------------------");

        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18){
                System.out.printf("%s con %d años %n", nombres.get(i), edades.get(i));
            }
        }

        // Se crea variable para guardar el alumno con mayor edad.
        int alumnoMayor = Collections.max(edades);

        // Imprimimos los alumnos con la mayor edad
        System.out.println("---------------------------------------");
        System.out.println("El alumno o alumnos con mayor edad son:");
        System.out.println("---------------------------------------");

        // Buscamos los elementos de la lista con mismo valor a alumnoMayor, por si hay varios con la misma edad.
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) == alumnoMayor) {
                System.out.println(nombres.get(i) + " con " + edades.get(i) + " años.");
            }
        }

        // Cerramos el Scanner
        sc.close();
    }
}
* */