package Basura;

import java.util.Scanner;

public class Sucio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día de la semana (lunes a viernes): ");
        String diaSemana = scanner.nextLine().toLowerCase();
        System.out.print("Introduce la hora (formato 24 horas): ");
        int horas = scanner.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutos = scanner.nextInt();

        int minutosHastaFinDeSemana = ((switch (diaSemana) {
            case "lunes" -> 0;
            case "martes" -> 1;
            case "miércoles" -> 2;
            case "jueves" -> 3;
            case "viernes" -> 4;
            default -> 0;
        }
        ) * 24 * 60 + (horas * 60) + minutos - ((4 * 24 + 15) * 60));

        System.out.println("Minutos hasta el fin de semana: " + minutosHastaFinDeSemana);
    }
}
