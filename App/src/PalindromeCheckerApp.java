public class PalindromeCheckerApp {
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Choose Strategy: 1.Stack  2.Deque");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            PalindromeStrategy strategy;

            if (choice == 1) {
                strategy = new StackStrategy();
            } else {
                strategy = new DequeStrategy();
            }

            PalindromeChecker checker = new PalindromeChecker(strategy);

            if (checker.checkPalindrome(input)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }

            sc.close();
        }
    }
}
