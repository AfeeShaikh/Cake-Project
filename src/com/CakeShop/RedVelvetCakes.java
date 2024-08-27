package com.CakeShop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RedVelvetCakes extends PersonalDetails {

	public void display_RedVelvetCakes() {

		try {
		System.out.println("+-------------------------------------+");
		System.out.println("| Which cake would you like to order? |");
		System.out.println("+-------------------------------------+");
		System.out.println();
		System.out.println("1 → Frosting Red Velvet Cake");

		System.out.println("2 → Tempting Red Velvet Cake");

		System.out.println("3 → Scrumptious Red Velvet Cake");

		System.out.println("4 → Luscious Choco Red Velvet Cake");

		System.out.println("5 → Sweet Red Heart Velvet Cake");

		System.out.println("6 → Previous Selection");

		CakePreferences p = new CakePreferences();
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			cname = "Frosting Red Velvet Cake";
			price = 750;
			p.weight();
			p.more();
			break;
		case 2:
			cname = "Tempting Red Velvet Cake";
			price = 800;
			p.weight();
			p.more();
			break;
		case 3:
			cname = "Scrumptious Red Velvet Cake";
			price = 800;
			p.weight();
			p.more();
			break;
		case 4:
			cname = "Luscious Choco Red Velvet Cake";
			price = 850;
			p.weight();
			p.more();
			break;
		case 5:
			cname = "Sweet Red Heart Velvet Cake";
			price = 850;
			p.weight();
			p.more();
			break;
		case 6:
			homepage();
			break;
		default:
			System.err.println("Please select options from above");
			display_RedVelvetCakes();
		}
		}
		catch(InputMismatchException i) {
			System.err.println("Enter numbers only!");
			display_RedVelvetCakes();
		}

	}
}
