package cz.spsejecna.cihak.matice;

import java.util.Scanner;

public class Kinosal {

	public static void main(String[] args) {
		int x = 1;
		Scanner sc = new Scanner(System.in);

		/*System.out.println("Zadej kolik sloupc� chce� m�t v matici.");
		int sloupce = sc.nextInt();
		System.out.println("Zadej kolik ��dk� chce� m�t v matici.");
		int radky = sc.nextInt();
		*/
		int[][] kinosal = new int[5][5];
		
		// napln�n� daty
		kinosal[2][2] = 1; // Prost�edek
		for (int i = 1; i < 4; i++) // 4. ��dek
		{
			kinosal[i][3] = 1;
		}
		for (int i = 0; i < 5; i++) // Posledn� ��dek
		{
			kinosal[i][4] = 1;
		}

		for (int j = 0; j < kinosal[0].length; j++) {
			for (int i = 0; i < kinosal.length; i++) {
				System.out.print(kinosal[i][j]);
			}
			System.out.println();
		}
	}

}
