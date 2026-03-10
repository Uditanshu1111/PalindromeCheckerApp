public class PalindromeCheckerApp {
    public class PerformanceTest {

        public static void testStrategy(PalindromeStrategy strategy, String input, String name) {

            long startTime = System.nanoTime();

            boolean result = strategy.checkPalindrome(input);

            long endTime = System.nanoTime();

            long duration = endTime - startTime;

            System.out.println(name + " Result: " + result);
            System.out.println(name + " Execution Time: " + duration + " ns\n");
        }

        public static void main(String[] args) {

            String input = "Never odd or even";

            testStrategy(new StackStrategy(), input, "Stack Strategy");
            testStrategy(new DequeStrategy(), input, "Deque Strategy");
            testStrategy(new TwoPointerStrategy(), input, "Two Pointer Strategy");
        }
    }
}
