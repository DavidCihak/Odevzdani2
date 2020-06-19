package cz.spsejecna.cihak.roky;

import java.util.Scanner;

public class PrestupnyRok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rok;
		boolean konec = false;
		Scanner sc = new Scanner(System.in);

		while (konec == false) {
			System.out.println("Zadej jak�koliv rok:");
			rok = sc.nextInt();
			boolean jePrestupny = false;

			if (rok % 4 == 0) { // rovnom�rn� d�liteln� �ty�mi
				if (rok % 100 == 0) {// rovnom�rn� d�liteln� stem
					if (rok % 400 == 0) {// rovnom�rn� d�liteln� �ty�stem
						jePrestupny = true;
					} else
						jePrestupny = false;
				} else
					jePrestupny = true;
			} else {
				jePrestupny = false;
			}

			if (jePrestupny == true) {
				System.out.println("Rok " + rok + " je p�estupn�.");
			} else {
				System.out.println("Rok " + rok + " nen� p�estupn�.");
			}
			System.out.println("Pro dal�� rok zadej -> 1");
			System.out.println("Pro ukon�en� programu zadej -> 2");
			int e = sc.nextInt();
			if (e == 2) {
				konec = true;
			}
		}
		System.out.println("Ukon�il jsi program");
	}

}
