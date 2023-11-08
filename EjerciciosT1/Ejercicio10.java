public class Ejercicio10 {
    public static void main(String[] args) {
        String cabeza = "  /\\_/\\";
        String ojos = "  (o.o)";
        String colorCabeza = "\u001B[34m"; // Azul
        String colorOjos = "\u001B[32m";   // Verde
        String resetColor = "\u001B[0m";


        System.out.println(colorCabeza + cabeza + resetColor);
        System.out.println(colorOjos + ojos + resetColor);
    }
}
