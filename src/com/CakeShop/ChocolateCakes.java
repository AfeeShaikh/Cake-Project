package com.CakeShop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChocolateCakes extends PersonalDetails {

	public void display_ChocolateCakes() {

		try {
		System.out.println("+-------------------------------------+");
		System.out.println("| Which cake would you like to order? |");
		System.out.println("+-------------------------------------+");
		System.out.println();
		System.out.println("1 → Death by Chocolate Cake");

		System.out.println("2 → Belgium Chocolate Cake");

		System.out.println("3 → Dutch Truffle Cake");

		System.out.println("4 → Mouth Melting Chocolate Cake");

		System.out.println("5 → Yummylicious Chocolate Cake");

		System.out.println("6 → Previous Selection");

		CakePreferences p = new CakePreferences();
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		switch (option) {
		case 1:
			cname = "Death by Chocolate Cake";
			price = 900;
			p.weight();
			p.more();
			break;
		case 2:
			cname = "Belgium Chocolate Cake";
			price = 850;
			p.weight();
			p.more();
			break;
		case 3:
			cname = "Dutch Truffle Cake";
			price = 750;
			p.weight();
			p.more();
			break;
		case 4:
			cname = "Mouth Melting Chocolate Cake";
			price = 800;
			p.weight();
			p.more();
			break;
		case 5:
			cname = "Yummylicious Chocolate Cake";
			price = 650;
			p.weight();
			p.more();
			break;
		case 6:
			homepage();
			break;
		default:
			System.err.println("Please select options from above");
			display_ChocolateCakes();
		}
		}
		catch(InputMismatchException i) {
			System.err.println("Enter numbers only!");
			display_ChocolateCakes();
		}
	}
}
