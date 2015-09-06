package com.mimmithorneus.intpalidrome;

import java.util.Scanner;

/**
 * Integer palidrome checker
 * 
 * @author Mimmi Thorneus <mimmi.thorneus@gmail.com>
 * @since 2015-06-12
 */

public class IntPalindrome {

	public static void main(String[] args) {
		int num = IntPalindrome.getFiveDigitInt();

		if (IntPalindrome.isPalindrome(num)) {
			System.out.println("The number " + num + " is a palidrome");
		} else {
			System.out.println("The number " + num + " isn't a palindrome");
		}

	}

	private static int getFiveDigitInt() {
		int num = 0;
		boolean hasValidInput = false;

		Scanner keyboard = new Scanner(System.in);

		while (hasValidInput == false) {
			System.out.println("Input a number with five digits:");
			num = keyboard.nextInt();

			if (num > 9999 && num < 100000) {
				hasValidInput = true;
			} else {
				System.out
						.println("Your number wasn't a positive integer with five digits!");
			}
		}
		keyboard.close();
		return num;
	}

	private static boolean isPalindrome(int num) {
		if (num == IntPalindrome.reverseInt(num)) {
			return true;
		} else {
			return false;
		}
	}

	private static int reverseInt(int num) {
		int reversedNum = 0;

		while (num != 0) {
			reversedNum = reversedNum * 10 + num % 10;
			num = num / 10;
		}

		return reversedNum;
	}
}
