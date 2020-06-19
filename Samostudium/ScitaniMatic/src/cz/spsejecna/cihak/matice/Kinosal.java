package cz.spsejecna.cihak.matice;

import java.util.Scanner;

public class Kinosal {

	public static void main(String[] args) {
		int x = 1;
		Scanner sc = new Scanner(System.in);

		/*System.out.println("Zadej kolik sloupcù chceš mít v matici.");
		int sloupce = sc.nextInt();
		System.out.println("Zadej kolik øádkù chceš mít v matici.");
		int radky = sc.nextInt();
		*/
		int[][] kinosal = new int[5][5];
		
		// naplnìní daty
		kinosal[2][2] = 1; // Prostøedek
		for (int i = 1; i < 4; i++) // 4. øádek
		{
			kinosal[i][3] = 1;
		}
		for (int i = 0; i < 5; i++) // Poslední øádek
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
