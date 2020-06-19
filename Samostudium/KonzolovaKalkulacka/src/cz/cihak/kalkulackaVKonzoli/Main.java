package cz.cihak.kalkulackaVKonzoli;

import java.util.Scanner;

public class Main {
	static boolean ukoncit = false;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(!ukoncit) {
			ukazMenu();
		}
		
	
	}
public static void ukazMenu() {
	System.out.print("1) Scitat\n2) Odcitat\n0) Ukoncit\nZadejte vasi volbu:");
	switch(sc.nextInt()) {
	case 1:
		scitej();
		break;
	case 2:
		odcitej();
		break;
	case 0:
		ukoncit = true;
		break;
		
		default:
			ukazMenu("Neplatna volba! Zadejte znovu.");
	
	}
}
public static void ukazMenu(String zprava) {
	System.out.println(zprava);
	ukazMenu();
}
private static void scitej() {
System.out.println("Zadej 1. èíslo:");	
 int prvniS = sc.nextInt();
System.out.println("Zadej 2. èíslo");
int druheS = sc.nextInt();
System.out.println("Vysledek je" + (prvniS + druheS));

}
private static void odcitej() {
	System.out.println("Zadej 1. èíslo:");	
	 int prvniO = sc.nextInt();
	System.out.println("Zadej 2. èíslo");
	int druheO = sc.nextInt();	
	System.out.println("Vysledek je" + (prvniO - druheO));
}
}
