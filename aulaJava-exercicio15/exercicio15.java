import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Adivinhe a quantidade de soldados que os 300 espartanos irão enfrentar");

        int quantidade;

        do {
            System.out.print("Palpite: ");
            quantidade = Integer.parseInt(entrada.nextLine());

            if (quantidade < 300000)
                System.out.println("Um pouco mais!");
            else if (quantidade > 300000)
                System.out.println("Um pouco menos!");

        } while (quantidade != 300000);

        System.out.println("Acertou mizeravi!");
    }
}