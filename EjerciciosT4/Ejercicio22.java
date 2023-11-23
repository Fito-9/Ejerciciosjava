package EjerciciosT4;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        int Numerodia=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
       String dia = s.nextLine();
       switch (dia) {
        case "lunes":
            Numerodia=0;
            break;
        case "martes":
            Numerodia=1;
            break;
        case "miercoles":
            Numerodia=2;
            break;
        case "jueves":
            Numerodia=3;
            break;
        case "viernes":
            Numerodia=4;
            break;
        default:
        System.out.println("El día introducido no es correcto.");
            break;
       }
       //Hora y minutos
       System.out.println("Introduzca la hora: ");
        int hora = s.nextInt();
        System.out.println("Introduzca los minutos: ");
        int minutos = s.nextInt();
       
        //Lógica
       int minutosTotales = (4 * 24 * 60) + (15 * 60);
       int minutosActuales = (Numerodia * 24 * 60) + (hora * 60) + minutos;

       System.out.println("Faltan " +(minutosTotales - minutosActuales ) + " minutos para llegar al finde semana");
s.close();
    }
}

