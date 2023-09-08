import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero 1: ");
        float num1 = Float.parseFloat(entrada.nextLine());

        System.out.print("Numero 2: ");
        float num2 = Float.parseFloat(entrada.nextLine());

        System.out.print("Numero 3: ");
        float num3 = Float.parseFloat(entrada.nextLine());

        System.out.println("Maior: " + MaiorDeTres(num1, num2, num3) + "\nMenor: " + MenorDeTres(num1, num2, num3)
                + "\nMedia: " + MediaDeTres(num1, num2, num3));
    }

    public static float MaiorDeTres(float num1, float num2, float num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }

    public static float MenorDeTres(float num1, float num2, float num3) {
        if (num1 < num2) {
            if (num1 < num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 < num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }

    public static float MediaDeTres(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3;
    }
}