import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {
            System.out.println(
                    "Selecione uma opção:\n1 - Gestante\n2 - Idosa\n3 - Deficiente\n4 - Nenhuma das opções acima");
            opcao = Integer.parseInt(entrada.nextLine());
        } while (opcao < 1 || opcao > 4);

        if (opcao == 4)
            System.out.println("Fila normal.");
        else
            System.out.println("Fila prioritária.");
    }
}