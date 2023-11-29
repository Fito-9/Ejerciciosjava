package EjerciciosT5;
import java.util.Scanner;
public class Ejercicio54 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la altura de la figura: ");
        int altura = scanner.nextInt();

        for (int fila = 1; fila <= altura; fila++) {
            for (int columna = 1; columna <= altura; columna++) {
                if (fila == 1 || fila == altura || columna == 1 || columna == altura || fila == columna || columna == altura - fila + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
