import java.util.Scanner;

public class bee1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double codigo1 = 4.00;
        double codigo2 = 4.50;
        double codigo3 = 5.00;
        double codigo4 = 2.00;
        double codigo5 = 1.50;

        int opcao = scanner.nextInt();
        int quant = scanner.nextInt();


        double total = 0;

        switch (opcao) {
            case 1:
                total = codigo1 * quant;
                break;
            case 2:
                total = codigo2 * quant;
                break;
            case 3:
                total = codigo3 * quant;
                break;
            case 4:
                total = codigo4 * quant;
                break;
            case 5:
                total = codigo5 * quant;
                break;
            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("Total: R$ %.2f%n" + total);
    }
}
