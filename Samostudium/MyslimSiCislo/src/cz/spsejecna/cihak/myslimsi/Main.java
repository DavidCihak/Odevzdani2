package cz.spsejecna.cihak.myslimsi;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();

		int tnum = rng.nextInt(100);
		System.out.println("Vítej ve høe: Myslím si èíslo");
		System.out.println("Nyní hledáš èíso mezi 0 a 100");
		System.out.println("Zadej svùj 1. tip!");
		int number;
		number = sc.nextInt();
		porovnej(number, tnum);
		
		int i = 2;

		while (number != tnum) {
			System.out.println("Zadej svùj " + i + ". tip!");
			number = sc.nextInt();
			porovnej(number, tnum);
			i++;
		}
		System.out.println("Vıbornì, uhodl jsi èíslo, které jsem si myslel na " + i + ". pokus.");
		System.exit(0);
	}

	public static void porovnej(int number, int tnum) {
		if (number < tnum) {
			System.out.println("Myslím si vìtší èíslo ne " + number);
		}
		if (number > tnum) {
			System.out.println("Myslím si menší èíslo ne " + number);
		}
	}
}
