
// Класс Primes выводит простые числа в диапазоне от 2 до 100.
 
public class Primes {

	public static void main(String[] args) {
		for(int i = 2; i <= 100; i++)
			if(isPrime(i))
				/* 
				 * метод println выводит на консоль некоторое значение
				 * с последующим переходом консоли на след. строку
				 */
				System.out.println("Число " + i + " является простым");
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; n > i; i++)
			if(n % i == 0)
				return false;
		return true;
	}

}
