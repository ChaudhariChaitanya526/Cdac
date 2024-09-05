import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int num = scanner.nextInt();


        for (int i = 0; i < num; i++) {

            for (int j = num - i; j < num; j++) {
                System.out.print(j);
            }

            System.out.print("0");

            for (int j = num - 1; j >= num - i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
