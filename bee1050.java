import java.util.Scanner;

public class bee1050 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o DDD: ");
        int ddd = scanner.nextInt();

        switch (ddd){
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("São Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Juiz de fora");
                break;
            case 19:
                System.out.println("campinas");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("Esse DDD nao existe");
                break;
        }
    }
}
