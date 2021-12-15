package _01_algorithms._2_fibonacci;

public class Fibonacci {
	public static void main (String[] args) {
		int number1 = 0;
		int number2 = 1;
		System.out.println(number1);
		System.out.println(number2);
		
		int sum = number1 + number2;
		
		for (int i = sum; i < 12; i++) {
			System.out.println(i);
		}
	}

}
