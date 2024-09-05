import java.util.Scanner;

public class pattern_que10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int num = scanner.nextInt();


        for (int i = 1; i <= num; i++) {

            int val = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(val);
                val = val+i;
            }
            System.out.println();
        }

        for (int i = num+2; i >= num-1; i--) {

            int val = i;

            for (int j = num-1; j >= 1; j--) {
                System.out.print(val);
                val = val+i;
            }
            System.out.println();
        }

        scanner.close();
    }
}
