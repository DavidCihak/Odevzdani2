package cz.spsejecna.cihak.prvocislo;

import java.util.Scanner;

public class Prvocislo {

	public static void main(String[] args) {
		int zbytek;
		int end = 1;

		boolean jePrvocislo = true;
		Scanner sc = new Scanner(System.in);

		while (end != 0) {
			System.out.println("Zadej ��slo: ");
			int numb = sc.nextInt();

			for (int i = 2; i <= numb / 2; i++) {

				zbytek = numb % i;
				System.out.println("Po vyd�len� ��sla " + numb + " ��slem " + i + " zbyde " + zbytek);

				if (zbytek == 0) {
					jePrvocislo = false;
				}
			}

			if (jePrvocislo == true) {
				System.out.println("��slo: " + numb + " je prvo��slo ");
			} else {
				System.out.println("��slo: " + numb + " nen� prvo��slo ");

			}
			System.out.println("Pro konec programu napi� 0");
			System.out.println("Pro pokra�ov�n� napi� jin� ��slo");
			end = sc.nextInt();
		}
	}
}
