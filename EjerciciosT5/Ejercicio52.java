package EjerciciosT5;



    public class Ejercicio52 {
        public static void main(String[] args) {
            System.out.println("Dime un número");
            int num = Integer.parseInt(System.console().readLine());
            int aux = num;
            int volteado = 0;
            int longitud = 0;
            while (aux > 0) {
                volteado = (volteado * 10) + (aux % 10);
                aux /= 10;
                longitud++;
            }
            if (longitud==1) {
                System.out.println("El número resultado es " + num);
            } else {
                int cifra = volteado % 10;
                int num2 = volteado / 10;
                int voltea2 = 0;
                while (num2 > 0) {
                    voltea2 = (voltea2 * 10)+ (num2 % 10);
                    num2 /= 10;
                }
                int numFinal = voltea2*10 + cifra;
                System.out.print("El número resultado es " + numFinal);
            }
        }
    }

