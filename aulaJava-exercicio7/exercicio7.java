import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = Integer.parseInt(entrada.nextLine());

        System.out.print("Informe seu salário: ");
        float salario = Float.parseFloat(entrada.nextLine());

        if (idade > 18 && salario > 2000)
            System.out.println("Você foi contemplato com um consórcio.");
        else
            System.out.println("Você não está apto para o consórcio");
    }
}