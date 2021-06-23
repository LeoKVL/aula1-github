package application;

import java.util.Locale;
import java.util.Scanner;

import entities.banco;

public class bancao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		banco banco;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			System.out.println();
			System.out.println("Account data: ");
			banco = new banco(number, name, depositoInicial);
			
		}
		else {
			System.out.println();
			System.out.println("Account data: ");
			banco = new banco (number, name);
		}
		System.out.println(banco);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		banco.deposito(deposito);
		System.out.println("Updated account data:");
	    System.out.println(banco);
	    System.out.println();
	    System.out.print("Enter a withdraw value: ");
	    double saque = sc.nextDouble();
	    banco.saque(saque);
	    System.out.println("Updated account data:");
	    System.out.print(banco);
	    
        sc.close();
	}

}
