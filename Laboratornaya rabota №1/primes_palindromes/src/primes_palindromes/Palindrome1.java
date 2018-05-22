package primes_palindromes;

import java.util.Scanner;

public class Palindrome1 {
//madam racecar apple kayak song noon
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		System.out.println("Введите количество слов для ввода");
		if(in.hasNextInt())
			num = in.nextInt();
		for(int i = 0; i < num; i++) {
			String str = "";
			if(in.hasNextLine())
				str = in.nextLine();
			if(!str.equals(""))
				if(isPalindrome(str))
					System.out.println("Слово " + str + " является палиндромом.");
				else
					System.out.println("Слово " + str + " не является палиндромом.");
			else
				num++;
		}
		in.close();
	}

	public static String reverseString(String str) {
		String temp = "";
		for(int i = str.length() - 1; i >= 0; i--)
			temp += str.charAt(i);
		return temp;
	}
	
	public static boolean isPalindrome(String str) {
		return str.equals(reverseString(str));
	}

}
