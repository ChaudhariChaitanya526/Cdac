import java.util.Scanner;
public class Alphabets_pyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int num = scanner.nextInt();

        char ch = 'A';

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(ch);
                ch++;
                if (ch > 'Z') {
                    ch = 'A';
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
