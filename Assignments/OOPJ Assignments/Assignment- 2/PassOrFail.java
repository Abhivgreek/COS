import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's percentage: ");
        int percentage = scanner.nextInt();
        scanner.close();

        String result = (percentage >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}
