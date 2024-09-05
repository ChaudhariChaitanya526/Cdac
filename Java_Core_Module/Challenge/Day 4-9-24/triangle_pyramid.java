import java.util.Scanner;
public class triangle_pyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int num = scanner.nextInt();

        int n = 1;

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == num) {
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
