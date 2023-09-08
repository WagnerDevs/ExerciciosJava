import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor mínimo: ");
        int min = Integer.parseInt(entrada.nextLine());

        System.out.print("Informe o valor máximo: ");
        int max = Integer.parseInt(entrada.nextLine());

        System.out.println("Os números primos na faixa informada são:");

        for (int i = min; i <= max; i++) {

            if (Primo(i)) {
                if (i == max)
                    System.out.print(i);
                else
                    System.out.print(i + " ");
            }
        }
    }

    public static boolean Primo(int valor) {

        int divisores = 0, divisivel = 1;

        do {
            if (0 == (valor % divisivel))
                divisores++;

            divisivel++;

        } while (divisores < 2 && divisivel <= (valor / 3) + 1);

        if (divisores == 1 && valor != 1)
            return true;

        return false;
    }
}