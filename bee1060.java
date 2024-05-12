import java.util.Scanner;

public class bee1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;

        for (int i = 0; i < 6; i++) {
            double number = scanner.nextDouble();
            if (number > 0) {
                positiveCount++;
            }
        }

        System.out.println(positiveCount + " valores positivos");

        scanner.close(); 
    }
}
