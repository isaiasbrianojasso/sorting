package uaslp.enginering.labs;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Integer[] datos = {3, 2, 6, 3, 1, 8, 5, 4};

        sort(datos, new IntegerAscendantComparator());

        for (int dato : datos) {
            System.out.print(dato + ", ");
        }

        System.out.println();

       sort(datos, new IntegerDescendantComparator());

        for (int dato : datos) {
            System.out.print(dato + ", ");
        }

        System.out.println();

        String[] nombres = {"Hector", "Jocelyn", "Antonio", "Caleb", "Isaías", "José", "Gustavo", "Alain", "Ivan"};

        sort(nombres, new StringAscendantComparator());
        System.out.println("Imprime  no ordenado por apellido \n");

        for (String dato : nombres) {
            System.out.print(dato + ", ");
        }

        System.out.println();

        sort(nombres, new StringDescendantComparator());
        System.out.println("Imprime ordenado por nombre \n");

        for (String dato : nombres) {
            System.out.print(dato + ", ");
        }

        Alumno alumnos[] = {
                new Alumno("Hector", "Almendarez", LocalDate.of(2001, Month.AUGUST, 11), 4723717),
                new Alumno("Jocelyn", "Briano", LocalDate.of(2001, Month.JULY, 21), 32321),
                new Alumno("Antonio", "Galvan", LocalDate.of(2002, Month.JANUARY, 1), 45365645),
                new Alumno("Francisco", "Martinez", LocalDate.of(2001, Month.FEBRUARY, 14), 72436723),
                new Alumno("Caleb", "Solis", LocalDate.of(2001, Month.FEBRUARY, 16), 72436723),
                new Alumno("Arturo", "Llamas", LocalDate.of(2001, Month.JULY, 12), 32321),


        };

        // Ordenar los alumnos por lastName y firstName e imprimir
        System.out.println();

        int i;
        for(i=0;i<6;i++)
        {
            sort(new String[]{alumnos[i].getLastName()}, new StringDescendantComparator());
        }
        System.out.println("Imprime ordenado por apellido \n");

        for(i=0;i<6;i++)
        {
            System.out.print(alumnos[i].getLastName()+", ");
        }

        // Ordenar por mes de nacimiento y por clave e imprimir


        int j;
        for(j=0;j<6;j++)
        {
            sort(new String[]{String.valueOf(alumnos[j].getClave())}, new IntegerAscendantComparator());

        }
        System.out.println("Imprime ordenado por clave \n");

        for(j=0;j<6;j++)
        {
            System.out.print("clave:"+alumnos[j].getClave()+", ");
        }

    }

    private static void sort(Object[] datos, Comparator comparator) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (comparator.compare(datos[j], datos[j + 1]) < 0) {
                    Object temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
