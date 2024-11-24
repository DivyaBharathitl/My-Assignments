package Day2Assignement;

public class PalindromeNumbCheck {
	
	public static void main(String[] args) {
		int number =1002;
        int originalNumber = number;
        int reversedNumber = 0;

        // Calculate the number of digits in the number
        int numberOfDigits = (int) Math.log10(number) + 1;

        // Reverse the number using a for loop
        for (int i = 1; i <= numberOfDigits; i++) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
	}

}
