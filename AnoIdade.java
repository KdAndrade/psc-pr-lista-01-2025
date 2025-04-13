
import java.util.Scanner;

public class AnoIdade {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual é o seu ano de nascimento?");
        int anonascimento = leitura.nextInt();
        int anoAtual = 2025;
        int idade = anoAtual - anonascimento;

        System.out.println("A idade é: " + idade + " anos.");

        leitura.close();
    }
}
