package cz.spsejecna.cihak.sorts;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pole = new int[10];
		for (int i = 0; i < pole.length; i++) {
			for (int j = 0; j < pole.length - 1; j++) {
				int x = 0;
				if (pole[j] > pole[j + 1]) {
					x = pole[j];
					pole[j] = pole[j + 1];
					pole[j + 1] = x;

				}

			}
		}
	}
}
