
import java.util.Scanner;

public class NumeroInteiro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número inteiro: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        int numant = numero - 1;
        int numsuc = numero + 1;

        System.out.println("Você digitou o número: " + numero);

        System.out.println("O número antecessor é: " + numant);
        System.out.println("O número sucessor é: " + numsuc);

        scanner.close();
    }
}
