package cz.spsejecna.cihak.myslimsi;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();

		int tnum = rng.nextInt(100);
		System.out.println("V�tej ve h�e: Mysl�m si ��slo");
		System.out.println("Nyn� hled� ��so mezi 0 a 100");
		System.out.println("Zadej sv�j 1. tip!");
		int number;
		number = sc.nextInt();
		porovnej(number, tnum);
		
		int i = 2;

		while (number != tnum) {
			System.out.println("Zadej sv�j " + i + ". tip!");
			number = sc.nextInt();
			porovnej(number, tnum);
			i++;
		}
		System.out.println("V�born�, uhodl jsi ��slo, kter� jsem si myslel na " + i + ". pokus.");
		System.exit(0);
	}

	public static void porovnej(int number, int tnum) {
		if (number < tnum) {
			System.out.println("Mysl�m si v�t�� ��slo ne� " + number);
		}
		if (number > tnum) {
			System.out.println("Mysl�m si men�� ��slo ne� " + number);
		}
	}
}
