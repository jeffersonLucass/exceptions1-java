package application;

import java.util.Locale;
import java.util.Scanner;

import exceptions.BusinessException;
import model.entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number:");
		int number = sc.nextInt();
		System.out.print("holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit:");
		double withdraw = sc.nextDouble();
		
		Account acc1 = new Account(number,holder,initialBalance,withdraw);
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
		acc1.withdraw(amount);
		System.out.println("New balance: "+String.format("%.2f",acc1.getBalance()));
		}
		catch(BusinessException e){
			System.out.println(e.getLocalizedMessage());
		}
		
		
		sc.close();
	}

}
