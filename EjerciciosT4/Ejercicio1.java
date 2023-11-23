package EjerciciosT4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
        String dia = s.nextLine();
        dia.toLowerCase();//Convertir todo esto en minuscúla

        switch(dia) {
            case "lunes":
            System.out.println("Programación multimedia");
            break;
            case "martes":
            System.out.println("Sistemas de gestión empresarial");
            break;
            case  "miercoles":
            System.out.println("Programación");
            break;
            case "jueves":
            System.out.println("Sistemas de gestión empresarial");
            break;
            case "viernes":
            System.out.println("Programación");
            break;
            case "sabado":
            System.out.println("No hay clase");
            break;
            case "domingo":
            System.out.println("No hay clase");
            break;
            
        }
        s.close();
    }
}