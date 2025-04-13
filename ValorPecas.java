
import java.util.Scanner;
import java.util.UUID;

public class ValorPecas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ipi = 5.0;

        String[] nomes = new String[2];
        String[] ids = new String[2];
        double[] valores = new double[2];
        int[] quantidades = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite o nome da peça %d: ", i + 1);
            scanner.nextLine();
            nomes[i] = scanner.nextLine();

            System.out.printf("Digite o valor unitário da peça %d: ", i + 1);
            valores[i] = scanner.nextDouble();

            System.out.printf("Digite a quantidade da peça %d: ", i + 1);
            quantidades[i] = scanner.nextInt();

            UUID uuid = UUID.randomUUID();
            String[] uuidParts = uuid.toString().split("-");
            ids[i] = uuidParts[0] + uuidParts[1];
        }

        double valorTotal = 0;
        for (int i = 0; i < 2; i++) {
            valorTotal += valores[i] * quantidades[i];
        }
        valorTotal *= (1 + ipi / 100);

        System.out.println("\nResumo das peças:");
        for (int i = 0; i < 2; i++) {
            System.out.printf("Peça %d - Nome: %s | ID: %s | Valor unitário: R$ %.2f | Quantidade: %d%n",
                    i + 1, nomes[i], ids[i], valores[i], quantidades[i]);
        }

        System.out.printf("\nO valor total a ser pago (com %.2f%% de IPI) é: R$ %.2f%n", ipi, valorTotal);

        scanner.close();
    }
}
