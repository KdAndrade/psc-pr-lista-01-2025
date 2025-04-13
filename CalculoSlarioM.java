
import java.util.Scanner;

public class CalculoSlarioM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1518.00;
        double salario = 0.0;

        System.out.println("Digite o seu salário: ");
        salario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salario / salarioMinimo;

        System.out.printf("O seu salário equivale a %.2f salários mínimos.%n", quantidadeSalariosMinimos);

    }
}
