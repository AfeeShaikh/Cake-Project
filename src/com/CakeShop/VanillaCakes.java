package com.CakeShop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VanillaCakes extends PersonalDetails {

	public void display_VanillaCakes() {

		try {
		System.out.println("+-------------------------------------+");
		System.out.println("| Which cake would you like to order? |");
		System.out.println("+-------------------------------------+");
		System.out.println();
		System.out.println("1 → Floral Vanilla Cream Cake");

		System.out.println("2 → Choco Vanilla Cream Cake");

		System.out.println("3 → Beautiful Pearl Vanilla Cake");

		System.out.println("4 → Love Expression Vanilla Cake");

		System.out.println("5 → Double Delight Choco Vanilla Cake");

		System.out.println("6 → Previous Selection");

		CakePreferences p = new CakePreferences();
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			cname = "Floral Vanilla Cream Cake";
			price = 750;
			p.weight();
			p.more();
			break;
		case 2:
			cname = "Choco Vanilla Cream Cake";
			price = 800;
			p.weight();
			p.more();
			break;
		case 3:
			cname = "Beautiful Pearl Vanilla Cake";
			price = 850;
			p.weight();
			p.more();
			break;
		case 4:
			cname = "Love Expression Vanilla Cake";
			price = 750;
			p.weight();
			p.more();
			break;
		case 5:
			cname = "Double Delight Choco Vanilla Cake";
			price = 900;
			p.weight();
			p.more();
			break;
		case 6:
			homepage();
			break;
		default:
			System.err.println("Please select options from above");
			display_VanillaCakes();
		}
		}
		catch(InputMismatchException i) {
			System.err.println("Enter numbers only!");
			display_VanillaCakes();
		}

	}
}
