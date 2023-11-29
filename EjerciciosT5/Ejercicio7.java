package EjerciciosT5;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int intentos = 4;
        boolean acertado = false;
        Scanner s = new Scanner(System.in);

        do {
            System.out.print("Introduzca la clave de la caja fuerte: ");
           int numeroIntroducido = s.nextInt();

            if (numeroIntroducido == 8888) {acertado = true;
      }
    else {
     System.out.println("Clave incorrecta");
     }
     intentos--;
        }
        while((intentos > 0) && (!acertado));
        if (acertado) {
        System.out.println("Ha abierto la caja fuerte.");
        } else {
        System.out.println("Lo siento, ha agotado las 4 oportunidades.");
     }
     s.close();
    }
}
