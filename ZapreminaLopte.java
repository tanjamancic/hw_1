package prvipaket;

import java.util.Scanner;

public class ZapreminaLopte {

	public static void main(String[] args) {
		double r, v;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite poluprecnik lopte: ");
		r = sc.nextDouble();
		v = ( 4 * Math.pow(r, 3) * Math.PI ) / 3;
		System.out.println("Zapremina lopte je: " + v );
	}

}
