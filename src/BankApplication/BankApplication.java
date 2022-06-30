package BankApplication;

import java.util.Scanner;

public class BankApplication {
	String cname;
	String cid;
	int deposit;
	int withdraw;
	int balance = 5000;
	

	// Constructor to get customer name and customer id
	BankApplication(String cname, String cid) {
		this.cname = cname;
		this.cid = cid;
		System.out.println("Welcome" + " " + this.cname + " " + this.cid);
	}
	void displayMenu() {
		System.out.println("1. View Balance");
		System.out.println("2. Deposit cash");
		System.out.println("3. Withdraw cash");
		System.out.println("0 Exit");
		System.out.println("Select 1 option");

		try (Scanner in = new Scanner(System.in)) {
			int menuChoice = in.nextInt();
			if (menuChoice == 1) {
				balance();
			} else if (menuChoice == 2) {
				depositCash();
			} else if (menuChoice == 3) {
				withdrawCash();
			} else if (menuChoice == 0) {
				exit();
			}

			else {
				System.out.println("Please select an option");
			}
		}

	}

	void depositCash() {
		try (Scanner depAmount = new Scanner(System.in)) {
			System.out.println("Enter amount you want to deposit");
			int depoAmount = depAmount.nextInt();
			System.out.println("Amount deposited is" + depoAmount);
			balance = balance + depoAmount;
			System.out.println("new balance" + balance);
			displayMenu();
		}

	}

	void withdrawCash() {
		try (Scanner withAmount = new Scanner(System.in)) {
			System.out.println("Enter amount you want to withdraw");
			int withdAmount = withAmount.nextInt();
			System.out.println("Amount withdrawn is" + withdAmount);

			balance = balance - withdAmount;
			System.out.println("new balance" + balance);
			displayMenu();
		}
	}
	void balance() {
		System.out.println("Your balance is" + balance);
		displayMenu();
	}

	void exit() {
		System.out.println("Thank You for visiting our bank.Welcome again");
		

	}

}