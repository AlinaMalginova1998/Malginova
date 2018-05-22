package primes_palindromes;

//Класс Polindrome проверяет, является ли строка полиндромом
public class Palindrome {
// madam racecar apple kayak song noon
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			if(isPalindrome(args[i]))
				/* 
				 * Метод println выводит на консоль некоторое значение
				 * с последующим переходом консоли на след. строку
				 */
				System.out.println("Слово " + args[i] + " является палиндромом.");
			else
				System.out.println("Слово " + args[i] + " не является палиндромом.");
		}
	}
	public static String reverseString(String str) {
		String temp = "";
		/*
		 * Метод lenght возвращает длину строки.
		 * Метод CharAt возвращает символ, расположенный по указанному индексу строки.
		 */
		for(int i = str.length() - 1; i >= 0; i--) // 
			temp += str.charAt(i); 
		return temp;
	}
	
	public static boolean isPalindrome(String str) {
		/*
		 * Метод Equals сравнивает строку str с указанным объектом.
		 * В нашем случае, с перевернутой строкой.
		 */
		return str.equals(reverseString(str)); 
	}

}