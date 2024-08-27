package com.CakeShop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ButterScotchCakes extends PersonalDetails {

	public void display_ButterScotchCakes() {

		try {
		System.out.println("+-------------------------------------+");
		System.out.println("| Which cake would you like to order? |");
		System.out.println("+-------------------------------------+");
		System.out.println();
		System.out.println("1 → Butterscotch Flavorsome Cake");

		System.out.println("2 → Tantalizing Butterscotch Cake");

		System.out.println("3 → Lipsmacking Premium Butterscotch Cake");

		System.out.println("4 → Butterscotch Treat Cake");

		System.out.println("5 → Delicious Butterscotch Cake");

		System.out.println("6 → Previous Selection");

		CakePreferences p = new CakePreferences();
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			cname = "Butterscotch Flavorsome Cake";
			price = 800;
			p.weight();
			p.more();
			break;
		case 2:
			cname = "Tantalizing Butterscotch Cake";
			price = 750;
			p.weight();
			p.more();
			break;
		case 3:
			cname = "Lipsmacking Premium Butterscotch Cake";
			price = 850;
			p.weight();
			p.more();
			break;
		case 4:
			cname = "Butterscotch Treat Cake";
			price = 800;
			p.weight();
			p.more();
			break;
		case 5:
			cname = "Delicious Butterscotch Cake";
			price = 750;
			p.weight();
			p.more();
			break;
		case 6:
			homepage();
			break;
		default:
			System.err.println("Please select options from above");
			display_ButterScotchCakes();
		}
		}
		catch(InputMismatchException i) {
			System.err.println("Enter numbers only!");
			display_ButterScotchCakes();
		}

	}
}
