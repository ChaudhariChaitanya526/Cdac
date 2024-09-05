import java.util.Scanner;

public class table_pattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int num = scanner.nextInt();


        for (int i = 1; i <= num; i++) {

            int mul = 0;

            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
                mul = (mul * 10) + k;
            }

            int result = mul * 8 + i;
            System.out.print("x8+" + i + "=" + result);
            System.out.println();
        }
        scanner.close();
    }
}
