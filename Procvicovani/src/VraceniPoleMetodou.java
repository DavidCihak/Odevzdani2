
public class VraceniPoleMetodou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cisla = new int[4];
		cisla[0] = 0;
		cisla[1] = 1;
		cisla[2] = 2;
		cisla[3] = 3;
		cisla = pole(cisla);
		System.out.println(cisla[2]);
		System.exit(0);
	}

	public static int[] pole(int[] CelaCisla) {
		int[] novePole = CelaCisla;
		for (int i = 0; i < CelaCisla.length; i++) {
			CelaCisla[i] += 5;
		}
		return novePole;
	}
}
