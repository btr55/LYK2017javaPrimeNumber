package tr.org.linux.kamp.primeNumber;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayı giriniz : ");
		int count = input.nextInt();
		int loop = 0;
		int num = 2;
		boolean isPrime = true;
		while(loop < count) {
			isPrime = true;
			for(int i = 2 ; i < num ;i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
					
				}
			}
			
			if(isPrime) {
				loop++;
				System.out.print(num + " ");
			}
			if(num<count)
			num++;
			
		}
				
	}
}
