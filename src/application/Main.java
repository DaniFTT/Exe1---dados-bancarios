package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Banco banco = new Banco();
		
		System.out.print("Enter account number: ");
                int accountNumber = sc.nextInt();
        
                sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		
						
		System.out.println();
		System.out.print("Is there na initial deposit (s/n): ");
		char resp = sc.nextLine().charAt(0);
		System.out.println();
		
		if(resp == 'n') {
			 banco = new Banco(accountNumber, name);
		}
		else if (resp == 's'){
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			 banco = new Banco(name, accountNumber, initialDeposit);
		}

		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(banco);
		
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double money = sc.nextDouble();
		banco.addValue(money);
		
		System.out.println();
		System.out.println("Update account data: ");
		System.out.println(banco.toString());
		
		System.out.println();
		System.out.print("Enter a whitdraw value: ");
		money = sc.nextDouble();
		banco.removeValue(money);
		
		System.out.println();
		System.out.println("Update account data: ");
		System.out.println(banco.toString());
		
		
		sc.close();
	}

}
