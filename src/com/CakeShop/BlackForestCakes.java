package com.CakeShop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BlackForestCakes extends PersonalDetails {

	public void display_BlackForestCakes() {
		
        try {
		System.out.println("+-------------------------------------+");
		System.out.println("| Which cake would you like to order? |");
		System.out.println("+-------------------------------------+");
		System.out.println();
		System.out.println("1 → Heavy Chocolate Blackforest Cake");

		System.out.println("2 → Blackforest Cream Cake");

		System.out.println("3 → German Black Forest Cake");

		System.out.println("4 → Delicious Black Forest Cake");

		System.out.println("5 → Black Forest Barbie Doll Cake");

		System.out.println("6 → Previous Selection");

		CakePreferences p = new CakePreferences();
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			cname = "Heavy Chocolate Blackforest Cake";
			price = 800;
			p.weight();
			p.more();
			break;
		case 2:
			cname = "Blackforest Cream Cake";
			price = 750;
			p.weight();
			p.more();
			break;
		case 3:
			cname = "German Black Forest Cake";
			price = 850;
			p.weight();
			p.more();
			break;
		case 4:
			cname = "Delicious Black Forest Cake";
			price = 800;
			p.weight();
			p.more();
			break;
		case 5:
			cname = "Black Forest Barbie Doll Cake";
			price = 850;
			p.weight();
			p.more();
			break;
		case 6:
			homepage();
			break;
		default:
			System.err.println("Please select options from above");
			display_BlackForestCakes();
		}
        }
        catch(InputMismatchException i) {
    		System.err.println("Enter numbers only!");
    		display_BlackForestCakes();
    	}
	}
}
