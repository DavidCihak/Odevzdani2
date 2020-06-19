package cz.spsejecna.cihak.prvocislo;

import java.util.Scanner;

public class Prvocislo {

	public static void main(String[] args) {
		int zbytek;
		int end = 1;

		boolean jePrvocislo = true;
		Scanner sc = new Scanner(System.in);

		while (end != 0) {
			System.out.println("Zadej èíslo: ");
			int numb = sc.nextInt();

			for (int i = 2; i <= numb / 2; i++) {

				zbytek = numb % i;
				System.out.println("Po vydìlení èísla " + numb + " èíslem " + i + " zbyde " + zbytek);

				if (zbytek == 0) {
					jePrvocislo = false;
				}
			}

			if (jePrvocislo == true) {
				System.out.println("Èíslo: " + numb + " je prvoèíslo ");
			} else {
				System.out.println("Èíslo: " + numb + " není prvoèíslo ");

			}
			System.out.println("Pro konec programu napiš 0");
			System.out.println("Pro pokraèování napiš jiné èíslo");
			end = sc.nextInt();
		}
	}
}
