import java.util.Scanner;

public class MinimumOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        int min = (a < b) ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d))
                          : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));

        System.out.println("The smallest number is: " + min);
    }
}
