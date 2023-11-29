package EjerciciosT5;
import java.util.Scanner;
public class Ejercicio55 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        long numeroIntroducido = Long.parseLong(scanner.nextLine());

        long copia = numeroIntroducido;
        int longitud = 0;

        while (copia > 0) {
            copia /= 10;
            longitud++;
        }


        int ultimo = (int) (numeroIntroducido % 10);
        long resultado = ultimo * (long) Math.pow(10, longitud - 1) + numeroIntroducido / 10;

        System.out.println("El número resultado es " + resultado);
    }
    
}
