package EjerciciosT4;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        String dia;

        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número del 1 al 7: ");
        int numero = s.nextInt();
        
        switch (numero) {
            case 1:
                dia="lunes";
                break;
            case 2:
                dia="martes";
                break;
            case 3:
                dia="miercoles";
                break;
            case 4:
                dia="jueves";
                break;
            case 5:
                dia="viernes";
            case 6:
                dia="sabado";
                break;
            case 7:
                dia="domingo";
                break;
                default:
                    dia = "Debe introducir un número del 1 al 7";
               
        }
         System.out.println(dia);
        s.close();
    }
}
