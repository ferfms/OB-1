import java.util.Scanner;

public class bee1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:\n1. Vertebrado\n2. Invertebrado");
        int opcao1 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        String palavra1 = "";
        String palavra2 = "";
        String palavra3 = "";

        switch (opcao1) {
            case 1:
                System.out.println("Escolha uma opção para vertebrado:\n1. Ave\n2. Mamífero");
                int opcao2 = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                palavra1 = "vertebrado";
                palavra2 = opcao2 == 1 ? "ave" : "mamifero";
                break;
            case 2:
                System.out.println("Escolha uma opção para invertebrado:\n1. Inseto\n2. Anelídeo");
                int opcao3 = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                palavra1 = "invertebrado";
                palavra2 = opcao3 == 1 ? "inseto" : "anelideo";
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close(); // Fechar o scanner antes de encerrar
                return;
        }

        System.out.println("Escolha uma opção para alimentação:\n1. Carnívoro\n2. Herbívoro\n3. Onívoro");
        int opcao4 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        palavra3 = opcao4 == 1 ? "carnivoro" : opcao4 == 2 ? "herbivoro" : "onivoro";

        String animal = "";

        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    animal = "aguia";
                } else if (palavra3.equals("onivoro")) {
                    animal = "pomba";
                }
            } else if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    animal = "homem";
                } else if (palavra3.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        } else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    animal = "pulga";
                } else if (palavra3.equals("herbivoro")) {
                    animal = "lagarta";
                }
            } else if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (palavra3.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }

        System.out.println("O animal escolhido é: " + animal);

        scanner.close(); // Fechar o scanner após a leitura
    }
}
