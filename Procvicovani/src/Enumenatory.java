import java.util.Scanner;

public class Enumenatory {
	enum Barvy {
		CERVENA, ZELENA, MODRA
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Napiš jakou z tìchto barev máš rád?");
		System.out.println("Èervenou");
		System.out.println("Zelenou");
		System.out.println("Modrou");
		Barvy barvicka = null;
		String vyber = sc.nextLine();
		switch (vyber) {

		case "Èervenou":
			barvicka = Barvy.CERVENA;

			break;
		case "Zelenou":
			barvicka = Barvy.ZELENA;
			break;
		case "Modrou":
			barvicka = Barvy.MODRA;
			break;

		}

		System.out.println("Tvoje oblíbená barva je " + barvicka);

	}

}
