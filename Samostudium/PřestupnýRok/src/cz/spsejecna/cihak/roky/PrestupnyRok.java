package cz.spsejecna.cihak.roky;

import java.util.Scanner;

public class PrestupnyRok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rok;
		boolean konec = false;
		Scanner sc = new Scanner(System.in);

		while (konec == false) {
			System.out.println("Zadej jakýkoliv rok:");
			rok = sc.nextInt();
			boolean jePrestupny = false;

			if (rok % 4 == 0) { // rovnomìrnì dìlitelný ètyømi
				if (rok % 100 == 0) {// rovnomìrnì dìlitelný stem
					if (rok % 400 == 0) {// rovnomìrnì dìlitelný ètyøstem
						jePrestupny = true;
					} else
						jePrestupny = false;
				} else
					jePrestupny = true;
			} else {
				jePrestupny = false;
			}

			if (jePrestupny == true) {
				System.out.println("Rok " + rok + " je pøestupný.");
			} else {
				System.out.println("Rok " + rok + " není pøestupný.");
			}
			System.out.println("Pro další rok zadej -> 1");
			System.out.println("Pro ukonèení programu zadej -> 2");
			int e = sc.nextInt();
			if (e == 2) {
				konec = true;
			}
		}
		System.out.println("Ukonèil jsi program");
	}

}
