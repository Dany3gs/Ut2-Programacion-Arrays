/*
* 8.- Queremos guardar los nombres y las edades de los alumnos de un curso. Realiza un programa
que introduzca el nombre y la edad de cada alumno (2 Arrays distintos). El proceso de lectura de
datos terminará cuando se introduzca como nombre un asterisco (*) Al finalizar se mostrará los
siguientes datos:
• Todos los alumnos mayores de edad.
• Los alumnos mayores (los que tienen más edad)*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


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
        System.out.println("Los alumnos mayores de edad son:");
        System.out.println("--------------------------------");

        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18){
                System.out.printf("%s con %d años %n", nombres.get(i), edades.get(i));
            }
        }

        // Encontramos la mayor edad sin ordenar las listas
        int alumnoMayor = Collections.max(edades);

        // Imprimimos los alumnos con la mayor edad
        System.out.println("El alumno o alumnos con mayor edad son:");
        System.out.println("-------------------------------");

        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) == alumnoMayor) {
                System.out.println(nombres.get(i) + " con " + edades.get(i) + " años.");
            }
        }
    }
}
