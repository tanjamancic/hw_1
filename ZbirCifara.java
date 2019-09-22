package prvipaket;

import java.util.Scanner;

public class ZbirCifara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Unesite trocifren broj: ");
		a = sc.nextInt();
		int x, y, z, b;
		x = ( a / 100 );
		y = ( a / 10 ) % 10;
		z = ( a % 10 );
		b = x + y + z;
		System.out.println("Zbir cifara unetog trocifrenog broja je " + b + ".");
		
	}

}
