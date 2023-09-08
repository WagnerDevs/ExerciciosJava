import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final float salarioMinimo = 1320;

        System.out.print("Insera seu salario: ");
        float salario = Float.parseFloat(entrada.nextLine());

        String salarios = (salario / salarioMinimo == 1.0 ? " salario minimo." : " salarios minimos.");

        System.out.println("Voce recebe " + salario / salarioMinimo + salarios);
    }
}