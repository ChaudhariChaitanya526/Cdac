import java.util.Scanner;

public class Dubble_pattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k =i; k <= (num*2) - i; k++) {
                System.out.print(" ");
            }
            for (int l=i; l>=1 ;l--) {
                System.out.print(l);
            }
            System.out.println();
        }
        scanner.close();
    }
}
