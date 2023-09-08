import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma string:");
        String str = entrada.nextLine();

        System.out.println(str.substring(0, str.length() / 2));
    }
}