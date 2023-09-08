import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = Integer.parseInt(entrada.nextLine());

        if (idade < 16)
            System.out.println("Você não pode votar.");
        else if (idade < 18 || idade > 65)
            System.out.println("Seu voto é facultativo.");
        else
            System.out.println("Seu voto é obrigatório.");
    }
}