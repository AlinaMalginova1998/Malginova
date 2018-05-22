package primes_palindromes;

//����� Polindrome ���������, �������� �� ������ �����������
public class Palindrome {
// madam racecar apple kayak song noon
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			if(isPalindrome(args[i]))
				/* 
				 * ����� println ������� �� ������� ��������� ��������
				 * � ����������� ��������� ������� �� ����. ������
				 */
				System.out.println("����� " + args[i] + " �������� �����������.");
			else
				System.out.println("����� " + args[i] + " �� �������� �����������.");
		}
	}
	public static String reverseString(String str) {
		String temp = "";
		/*
		 * ����� lenght ���������� ����� ������.
		 * ����� CharAt ���������� ������, ������������� �� ���������� ������� ������.
		 */
		for(int i = str.length() - 1; i >= 0; i--) // 
			temp += str.charAt(i); 
		return temp;
	}
	
	public static boolean isPalindrome(String str) {
		/*
		 * ����� Equals ���������� ������ str � ��������� ��������.
		 * � ����� ������, � ������������ �������.
		 */
		return str.equals(reverseString(str)); 
	}

}