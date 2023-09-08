import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero 1: ");
        float num1 = Float.parseFloat(entrada.nextLine());

        System.out.print("Numero 2: ");
        float num2 = Float.parseFloat(entrada.nextLine());

        System.out.println("os números digitados são " + num1 + " e " + num2);
    }
}