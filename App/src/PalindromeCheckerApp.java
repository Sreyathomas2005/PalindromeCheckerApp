public class PalindromeCheckerApp {
    public static boolean isPalindromeReverse(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
    public static boolean isPalindromeTwoPointer(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String s) {
        return checkRecursive(s, 0, s.length() - 1);
    }

    private static boolean checkRecursive(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return checkRecursive(s, left + 1, right - 1);
    }
    public static void benchmark(String algoName, String input, PalindromeStrategy strategy) {
        long start = System.nanoTime();
        boolean result = strategy.isPalindrome(input);
        long end = System.nanoTime();
        long duration = end - start;

        System.out.println("[Algorithm: " + algoName + "]");
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + duration + " ns\n");
    }
    interface PalindromeStrategy {
        boolean isPalindrome(String s);
    }
    public static void main(String[] args) {
        String input = "level";

        System.out.println("Input : " + input + "\n");

        benchmark("String Reversal", input, PalindromeCheckerApp::isPalindromeReverse);
        benchmark("Two-Pointer", input, PalindromeCheckerApp::isPalindromeTwoPointer);
        benchmark("Recursive", input, PalindromeCheckerApp::isPalindromeRecursive);
    }
}
