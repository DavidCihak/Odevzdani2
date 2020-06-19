import java.util.Scanner;

public class ZnakString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Pro pøevedení stringu do znaku napiš -> 1");
		System.out.println("Pro pøevedení znakù do Stringu napiš -> 2");
		int volba = sc.nextInt();

		switch (volba) {
		case 1:
			StringZnak();
			break;

		case 2:
			ZnakString();
			break;

		}

	}

	public static void StringZnak() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadej jakékoliv slovo: ");
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("Znak na " + i + ". Pozici : " + ch);
		}
	}

	public static void ZnakString() {
		Scanner sc = new Scanner(System.in);
		int pocet = 1;
		System.out.println("Zadej slovo:");
		char ch = sc.next().charAt(pocet);
		System.out.println("Zadej, kolikátý znak chceš vypsat:");
		pocet = sc.nextInt();
		

			String str = Character.toString(ch);
			System.out.println("String je: " + str);
		

	}
}
