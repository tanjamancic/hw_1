package prvipaket;

import java.util.Scanner;

public class SrednjaVrednost {

	public static void main(String[] args) {
		double a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj:");
		a = sc.nextDouble();
		System.out.println("Unesite drugi broj:");
		b = sc.nextDouble();
		System.out.println("Unesite treci broj:");
		c = sc.nextDouble();
		d= ( a + b + c ) / 3;
		System.out.println("Srednja vrednost unetih brojeva je: " + d );
		
	}

}
