import java.util.Scanner;

public class pyramid_pattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        scanner.close();

    }
}
