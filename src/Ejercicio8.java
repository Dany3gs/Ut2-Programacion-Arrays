/*
* 8.- Queremos guardar los nombres y las edades de los alumnos de un curso. Realiza un programa
que introduzca el nombre y la edad de cada alumno (2 Arrays distintos). El proceso de lectura de
datos terminará cuando se introduzca como nombre un asterisco (*) Al finalizar se mostrará los
siguientes datos:
• Todos los alumnos mayores de edad.
• Los alumnos mayores (los que tienen más edad)*/

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Se inicia array de nombres en 50 por tener una referencia
        String[] nombres = new String[50];
        int[] edades = new int[50];
        int contador = 0;
        boolean salir = true;
        System.out.println("Indique su nombre y edad (introduzca '*' para finalizar):");

        // Rellenamos los arrays con los datos del usuario
        while (salir) {
            System.out.print("Su nombre? ");
            String nombre = sc.nextLine();

            // Se indica el carácter de finalización
            if (nombre.equals("*")) {
                salir = false;
                continue;
            }

            // Se limita el bucle a la cantidad de elementos que se desee en el array.
            if (contador == 50) {
                System.out.println("Se ha alcanzado el límite máximo de 50 alumnos.");
                salir = false;
                continue;
            }

            nombres[contador] = nombre;

            //
            System.out.print("Su edad? ");
            int edad = sc.nextInt();
            // Para que no se quede esperando respuesta la consola después de introducir la edad,
            // hay que consumir la linea que queda cuando se hace enter, por eso hay que poner otra
            // entrada que limpie el buffer, consumiendo ese salto de linea, así pasa a preguntar
            // el nombre y no se queda esperando la consola.
            sc.nextLine();
            edades[contador] = edad;

            contador++;
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
