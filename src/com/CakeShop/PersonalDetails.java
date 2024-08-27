package com.CakeShop;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PersonalDetails implements CakesAbstract { // Super Class
	private String name;
	private long contact;
	private String email;
	private String address;
	private String gender;
	private String password;
	private String cpassword;
	static boolean isRegistered = false;
	boolean b = false;

	static String cname;
	static String qty;
	static String type;
	static double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	@Override
	public void signup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = sc.nextLine();
		contactValidation();
		emailValidation();
		System.out.println("Enter address:");
		address = sc.nextLine();
		genderValidation();
		passwordValidation();

	}

	public void passwordValidation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password:");
		password = sc.nextLine();
		System.out.println("Enter again to confirm password:");
		cpassword = sc.nextLine();

		if (cpassword.equals(password)) // Comparing data
		{
			System.out.println("Registered Successfully!");
			isRegistered = true;

		} else {
			System.err.println("Password didn't matched!");
			passwordValidation();
		}
	}

	public void contactValidation() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter contact no:");
			contact = sc.nextLong();
			if (contact > 999999999L && contact < 10000000000L) {
				// System.out.println("Contact added successfully!");
			} else {
				System.err.println("Enter 10 digits only");
				contactValidation();
			}
		} catch (InputMismatchException i) {
			System.err.println("Enter numbers only");
			contactValidation();
		}

	}

	public void emailValidation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email:");
		email = sc.nextLine();
		if (email.endsWith("@gmail.com") || email.endsWith("@outlook.com") || email.endsWith("@yahoo.com")
				|| email.endsWith("@hotmail.com")) {
			// System.out.println("Valid email");
		} else {
			System.err.println("Enter valid email");
			emailValidation();

		}

	}

	public void genderValidation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender [M/F]");
		char gender = sc.next().charAt(0);
		if (gender == 'F' || gender == 'f' || gender == 'm' || gender == 'M') {

		} else {
			System.err.println("Enter valid gender!");
			genderValidation();
		}
	}

	@Override
	public void login() {
		if (isRegistered == false) {
			System.out.println("No account existed. Please Register!");
			System.out.println();
			signup();
		} else {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println();
				System.out.println("+------------------------------+");
				System.out.println("| Choose your option for login |");
				System.out.println("+------------------------------+");
				System.out.println();
				System.out.println("1 → login with conatact no:");
				System.out.println("2 → login with email id:");
				int x = sc.nextInt();

				switch (x) {
				case 1:
					contactVerification();
					break;
				case 2:
					emailVerification();
					break;

				default:
					System.err.println("Please select options from above");
					login();
				}
			} catch (InputMismatchException i) {
				System.err.println("Enter numbers only!");
				login();
			}
		}
	}

	public void contactVerification() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your contact number:");
		long contact = sc.nextLong();
		sc.nextLine();
		if (contact == this.contact) {
			passwordVerification();
		} else {
			System.err.println("Enter correct contact number");
			contactVerification();
		}

	}

	public void emailVerification() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email id:");

		String email = sc.nextLine();
		if (email.equals(this.email)) {
			passwordVerification();
		} else {
			System.err.println("Enter correct email id");
			emailVerification();
		}

	}

	public void passwordVerification() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password:");
		String password = sc.nextLine();
		if (password.equals(this.password)) {
			captcha();
			System.out.println("Login Succesfull");
			b = true;

		} else {
			System.err.println("Enter correct password:");
			passwordVerification();
		}
	}

	public void captcha() {
		String captcha = "";
		Random r = new Random();
		while (captcha.length() < 6) {
			int n = r.nextInt();
			if ((n >= 65 && n <= 90) || (n >= 97 && n <= 122) || (n >= 48 && n <= 57))// ASCII Values of Char
																						// A-Z,a-z,0-9
			{
				captcha = captcha + (char) n;// Narrowing
			}
		}
		System.out.println(captcha);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter above captcha");
		String userCaptcha = sc.nextLine();
		if (userCaptcha.equals(captcha)) {
			// System.out.println("Successfull");
		} else {
			System.err.println("Captcha not matched. Try Again!");
			captcha();
		}
	}

	@Override
	public void homepage() {
		try {
			System.out.println("+---------------------------------------+");
			System.out.println("| Please select your choice of flavour! |");
			System.out.println("+---------------------------------------+");
			System.out.println();
			System.out.println("1 → Chocolate Cakes");

			System.out.println("2 → Vanilla Cakes");

			System.out.println("3 → Butter Scotch Cakes");

			System.out.println("4 → Red Velvet Cakes");

			System.out.println("5 → Black Forest Cakes");

			System.out.println("6 → Exit");

			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch (option) {
			case 1:
				ChocolateCakes chocolate = new ChocolateCakes();
				chocolate.display_ChocolateCakes();
				break;
			case 2:
				VanillaCakes vanilla = new VanillaCakes();
				vanilla.display_VanillaCakes();
				break;
			case 3:
				ButterScotchCakes butterscotch = new ButterScotchCakes();
				butterscotch.display_ButterScotchCakes();
				break;
			case 4:
				RedVelvetCakes redvelvet = new RedVelvetCakes();
				redvelvet.display_RedVelvetCakes();
				break;
			case 5:
				BlackForestCakes blackforest = new BlackForestCakes();
				blackforest.display_BlackForestCakes();
				break;
			case 6:
				System.out.println("****************************************");
				System.out.println("*        ThankYou for Visiting!       *");
				System.out.println("****************************************");

				System.exit(0);
			default:
				System.err.println("Choose correct option from above");
				homepage();
			}
		} catch (InputMismatchException i) {
			System.err.println("Enter numbers only!");
			homepage();
		}

	}

	static List<Cake> cart = new ArrayList<>();
	static double sum = 0;

	public static void bill() {
		for (Cake c : cart) {
			sum = sum + c.price;
			System.out.println(c);
		}
		System.out.println("`````````````````````````````````````````````````````````````````````````````````````");
		System.out.println();
		System.out.println("Total amount: ₹" + sum);
		System.out.println("=======================");
		CakePreferences p = new CakePreferences();
		p.message();
	}

	@Override
	public void checkout() {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("+-----------------------+");
			System.out.println("| Select payment method |");
			System.out.println("+-----------------------+");
			System.out.println();
			System.out.println("1 → Cash on delivery");
			System.out.println("2 → UPI");
			System.out.println("3 → Credit/Debit card");

			int option = sc.nextInt();
			switch (option) {
			case 1:
				confrim();
				break;
			case 2:
				upi();
				break;
			case 3:
				card();
				break;
			default:
				System.err.println("Please select options from above");
				checkout();
			}

		} catch (InputMismatchException i) {
			System.err.println("Enter numbers only!");
			checkout();
		}
	}

	public void upi() {
		String reset = "\u001B[0m";
		String blue = "\u001B[34m";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your upi id");
		String id = sc.nextLine();
		if (id.endsWith("@upi")) {
			String transactionId = "";
			Random r = new Random();
			while (transactionId.length() < 6) {
				int n = r.nextInt();
				if (n >= 48 && n <= 57)// ASCII Values of Numbers 0-9

				{
					transactionId = transactionId + n;
				}
			}
			System.out.println("Click on the link to make your payment");
			System.out.println(blue + "upi://pay?pa=" + id + "&tid=" + transactionId + reset);
			confrim();
		} else {
			System.err.println("Enter valid id");
			upi();
		}

	}

	public void card() {
		Scanner sc = new Scanner(System.in);
		cardnumberValidation();
		System.out.println("Name on card");
		String cardname = sc.nextLine();
		System.out.println("Enter expiry date as MM/YY");
		String expdate = sc.next();

		cvvValidation();
		confrim();
	}

	public void cardnumberValidation() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your card number");
			long cnumber = sc.nextLong();
			if (cnumber > 999999999999999L && cnumber < 10000000000000000L) {
				// System.out.println("cnumber added successfully!");
			} else {
				System.err.println("Enter 16 digits only");
				cardnumberValidation();
			}
		} catch (InputMismatchException i) {
			System.err.println("Enter numbers only");
			cardnumberValidation();
		}

	}

	public void cvvValidation() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter CVV number");
			int cvv = sc.nextInt();
			if (cvv > 999 && cvv < 10000) {
				// System.out.println("cvv added successfully!");
			} else {
				System.err.println("Enter 4 digits only");
				cvvValidation();
			}
		} catch (InputMismatchException i) {
			System.err.println("Enter numbers only");
			cvvValidation();
		}
	}

	public void confrim() {
		String OTP = "";
		Random r = new Random();
		while (OTP.length() < 4) {
			int n = r.nextInt();
			if (n >= 48 && n <= 57)// ASCII Values of Numbers 0-9

			{
				OTP = OTP + n;
			}
		}

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("╭──────────────────────────╮");
		System.out.println("│ Enter the OTP to confirm │");
		System.out.println("╰──────────────────────────╯");
		System.out.println(OTP);
		String userOTP = sc.nextLine();
		if (userOTP.equals(OTP)) {
			System.out.println();
			System.out.println("*****************************************************");
			System.out.println("*     Thankyou for ordering from Delish Cakes❤️     *");
			System.out.println("*          You'll receive your order soon.          *");
			System.out.println("*                  Have a nice day!                 *");
			System.out.println("*****************************************************");
			System.exit(0);
		} else {
			System.err.println("OTP not matched. Try Again!");
			confrim();
		}

	}
}
