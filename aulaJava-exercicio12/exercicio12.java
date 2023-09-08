import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String comando;

        do {

            System.out.print("número 1: ");
            var num1 = Integer.parseInt(entrada.nextLine());

            System.out.print("número 2: ");
            var num2 = Integer.parseInt(entrada.nextLine());

            int opcao;

            do {

                System.out.println("Escolha uma opção:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
                opcao = Integer.parseInt(entrada.nextLine());

            } while (opcao < 1 || opcao > 4);

            if (opcao == 1)
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            else if (opcao == 2)
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            else if (opcao == 3)
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            else if (opcao == 4)
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

            do {

                System.out.println("Deseja continuar? (S/N)");
                comando = entrada.nextLine();

            } while (!comando.equalsIgnoreCase("s") && !comando.equalsIgnoreCase("n"));

        } while (!comando.equalsIgnoreCase("n"));
    }
}