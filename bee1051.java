import java.util.Scanner;

    public class bee1051 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escreva seu salario: ");
            double salario = scanner.nextDouble();
            double imposto = 0.0;

            if (salario <=2000) {
                System.out.println("Isento");
            } else if (salario <= 3000) {
                imposto = (salario - 2000) * 0.08;
            } else if (salario <=4500) {
                imposto = (salario - 3000) * 0.16;
            } else if (salario >=4500) {
                imposto = (salario) * 0.28;
            }

            if (imposto > 0.0) {
                System.out.printf("R$ %.2f%n", imposto);

            };
        }}
        
    