/*
* 6.- Crea un programa que pida un número al usuario un número de meses (por ejemplo, el 4) y diga
cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar un vector. Para simplificarlo
vamos a suponer que febrero tiene 28 días.*/

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] meses = {
                "El mes es Enero y tiene 31 días.",
                "El mes es Febrero y tienes 28 días.",
                "El mes es Marzo y tiene 31 días.",
                "El mes es Abril y tiene 30 días.",
                "El mes es Mayo y tiene 31 días.",
                "El mes es Junio y tiene 30 días",
                "El mes es Julio y tiene 31 días.",
                "El mes es Agosto y tiene 31 días",
                "El mes es Septiembre y tiene 30 días.",
                "El mes es Octubre y tiene 31 días.",
                "El mes es Noviembre y tiene 30 días.",
                "El mes es Diciembre y tiene 31 días."
        };

        System.out.println("Indique un número del 1 al 12 para ver que mes es y cuantos días tiene dicho mes.");
        int mes = Integer.parseInt(sc.nextLine());

        int i = 0;
        while (i < meses.length) {
            if (mes == (i + 1)) {
                System.out.println(meses[i]);
            } else if (mes > 12 || mes < 0){
                System.out.println("Valor no válido, inténtelo de nuevo.");
                mes = sc.nextInt();
            }
            i++;
        }
    }
}
