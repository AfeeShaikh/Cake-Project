package com.CakeShop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LayerUp {
	static {
		System.out.println("╔═══════════════════════════════════════════════════════╗");
		System.out.println("║                      DELISH CAKES                     ║");
		System.out.println("║    ----------------baked with love----------------    ║");
		System.out.println("╚═══════════════════════════════════════════════════════╝");
	}

	public static void main(String[] args) {
		try {
			System.out.println();
			System.out.println("1 → Register");
			System.out.println("2 → Login");
			System.out.println("3 → Guest Login");
			System.out.println("4 → Exit");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();

			PersonalDetails ref = new PersonalDetails();
			switch (x) {
			case 1:
				ref.signup();

			case 2:
				ref.login();

			case 3:
				ref.homepage();
				break;
			case 4:
				System.out.println("****************************************");
				System.out.println("*        ThankYou for Visiting!       *");
				System.out.println("****************************************");
				System.exit(0);
				break;

			default:
				System.err.println("Please select options from above");
				main(null);
			}
		} catch (InputMismatchException i) {
			System.err.println("Enter numbers only!");
			main(null);
		}
	}
}
