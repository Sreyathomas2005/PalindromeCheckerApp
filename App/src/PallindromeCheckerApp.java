public class PalindromeCheckerUC4 {

    // Method to check if a string is a palindrome using char[] and two-pointer technique
    public static boolean isPalindrome(String input) {
        // Step 1: Convert string to char[]
        char[] chars = input.toCharArray();

        // Step 2: Initialize two pointers
        int left = 0;
        int right = chars.length - 1;

        // Step 3: Compare characters while moving pointers inward
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }
        return true; // No mismatches, it's a palindrome
    }

    // Main method for testing
    public static void main(String[] args) {
        String test1 = "madam";
        String test2 = "hello";
        String test3 = "racecar";

        System.out.println(test1 + " -> " + isPalindrome(test1));
        System.out.println(test2 + " -> " + isPalindrome(test2));
        System.out.println(test3 + " -> " + isPalindrome(test3));
    }
}


