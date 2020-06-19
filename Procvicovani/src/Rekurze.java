
public class Rekurze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(faktorialSmycka(5));
		System.out.println(faktorialRekurze(5));

	}

	public static int faktorialSmycka(int cislo) {
		for (int i = cislo - 1; i > 0; i--) {
			cislo *= i;

		}
		return cislo;
	}

	public static int faktorialRekurze(int cislo) {
		if (cislo == 1) {
			return 1;
		} else {
			return cislo * faktorialRekurze(cislo - 1);
		}
	}
}
