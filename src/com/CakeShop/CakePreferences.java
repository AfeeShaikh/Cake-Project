package com.CakeShop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CakePreferences extends PersonalDetails {

	public void weight() {
		try {
			System.out.println("+--------------------------------------+");
			System.out.println("| Please select the size of your cake! |");
			System.out.println("+--------------------------------------+");
			System.out.println();
			System.out.println("1 → 500gm");
			System.out.println("2 → 1kg");
			System.out.println("3 → 1.5kg");
			System.out.println("4 → 2kg");
			System.out.println("5 → Back to Menu");

			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch (option) {
			case 1:
				price = (price * 0.5);
				qty = "500gm";
				egg();
				break;
			case 2:
				qty = "1kg";
				egg();
				break;
			case 3:
				price = (price * 1.5);
				qty = "1.5kg";
				egg();
				break;
			case 4:
				price = (price * 2.0);
				qty = "2kg";
				egg();
				break;
			case 5:
				homepage();
				break;
			default:
				System.err.println("Choose correct option from above");
				weight();
			}

		} catch (InputMismatchException i) {
			System.err.println("Enter numbers only!");
			weight();
		}

	}

	public void egg() {

		Scanner sc = new Scanner(System.in);
		System.out.println("╭──────────────────────────────────────────╮");
		System.out.println("│Do you want your cake to be eggless? [y/n]│");
		System.out.println("╰──────────────────────────────────────────╯");

		char confirm = sc.next().charAt(0);
		if (confirm == 'y' || confirm == 'Y') {

			type = "Eggless";
			System.out.println("Price: ₹" + price);

			cart.add(new Cake(cname, type, qty, price));
		} else if (confirm == 'N' || confirm == 'n') {

			type = "With Egg";
			System.out.println("Price: ₹" + price);
			cart.add(new Cake(cname, type, qty, price));
		} else {
			System.err.println("Enter valid input");
			egg();
		}

	}

	public void more() {

		Scanner sc = new Scanner(System.in);
		System.out.println("╭───────────────────────────────────╮");
		System.out.println("│Would you like to order more? [y/n]│");
		System.out.println("╰───────────────────────────────────╯");

		char order = sc.next().charAt(0);
		if (order == 'y' || order == 'Y') {
			homepage();
		} else if (order == 'n' || order == 'N') {
			if (isRegistered == false) {
				System.out.println("Please Register before proceeding");
				signup();
				bill();
			} else {
				bill();
			}
		} else {
			System.err.println("Enter valid input");
			more();
		}

	}

	public void message() {

		System.out.println();
		System.out.println("╭────────────────────────────────────────────────────────╮");
		System.out.println("│Would you like to wright any message on your cake? [y/n]│");
		System.out.println("╰────────────────────────────────────────────────────────╯");
		Scanner sc = new Scanner(System.in);
		char confirm = sc.next().charAt(0);
		if (confirm == 'y' || confirm == 'Y') {

			System.out.println("┌─                                ─┐");
			System.out.println("  Please write the message below👇   ");
			System.out.println("└─                                ─┘");
			sc.nextLine();
			String message = sc.nextLine();
			System.out.println();

			System.out.println("******************************************");
			System.out.println("*        Proceeding for checkout..       *");
			System.out.println("******************************************");

			System.out.println("┌─                         ─┐");
			System.out.println("  Add your shipping address  ");
			System.out.println("└─                         ─┘");

			String shipping = sc.nextLine();

			checkout();

		} else if (confirm == 'N' || confirm == 'n') {

			System.out.println("******************************************");
			System.out.println("        Proceeding for checkout...        ");
			System.out.println("******************************************");

			System.out.println("┌─                         ─┐");
			System.out.println("  Add your shipping address  ");
			System.out.println("└─                         ─┘");
			sc.nextLine();
			String shipping = sc.nextLine();

			checkout();

		} else {
			System.err.println("Enter valid input");
			message();
		}

	}

}
