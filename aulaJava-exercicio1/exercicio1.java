import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        System.out.print("Digite seu nome: ");

        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();

        System.out.println("Seu nome é " + nome);
    }
}