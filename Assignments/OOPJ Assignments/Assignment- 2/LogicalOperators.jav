import java.util.Scanner; 

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0 && num % 2 == 0) {
            System.out.println(num + " is positive and even.");
        } else if (num > 0 && num % 2 != 0) {
            System.out.println(num + " is positive but not even.");
        } else {
            System.out.println(num + " is not positive.");
        }

        sc.close();
    }
}
