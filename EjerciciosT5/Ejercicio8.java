package EjerciciosT5;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Porfavor introduzca un número de la tabla de multiplicar hasta el 10");
        int número = s.nextInt();
        for (int i= 0; i<=10; i++){
            System.out.println(número + " x " + i + " = " + número * i);

        }
        s.close();
    }
}