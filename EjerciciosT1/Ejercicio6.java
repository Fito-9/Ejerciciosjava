public class Ejercicio6 {
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RESET = "\033[0m";  // Text Reset

    public static void main(String[] args) {
        System.out.println("    " + BLACK_BRIGHT + "*" + RESET);
        System.out.println("   " + BLACK_BRIGHT + "*" + "*" + "*" + RESET);
        System.out.println("  " + BLACK_BRIGHT + "*" + "*" + "*" + "*" + "*" + RESET);
        System.out.println(" " + BLACK_BRIGHT + "*" + "*" + "*" + "*" + "*" + "*" + "*" + RESET);
        System.out.println(BLACK_BRIGHT + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + RESET);
    }
}
