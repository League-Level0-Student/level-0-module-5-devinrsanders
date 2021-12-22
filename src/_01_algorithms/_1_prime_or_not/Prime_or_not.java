package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_not {
	public static void main (String[] args) {
		String numberString = JOptionPane.showInputDialog(null, "Type a number");
		int number = Integer.parseInt(numberString);
		for(int i = 2; i <= number/2; ++i){
            if(number % i == 0){
            	System.out.println("This is not a prime number");
		} else {
			System.out.println("This is a prime number");
		}
		
	}

}
}