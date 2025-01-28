package com.wipro.bankingapplication;

import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {
		Person person1 = new Person("Rajat Raj", 500000);
		Person person2 = new Person("RR", 100000);
	    Scanner scanner = new Scanner(System.in);
	    boolean isLoggedIn = true;
	    
	    if(isLoggedIn == true) {
	    	System.out.println("Logged in as:"+ person1.name);
		    	while (true) {
		        System.out.println("\nMenu Options Available For The Bank Details");
		        System.out.println("1 -> Check Balance of the account");
		        System.out.println("2 -> Deposit amount");
		        System.out.println("3 -> Withdraw amount");
		        System.out.println("4 -> Transfer amount");
		        System.out.println("5 -> Exit the website");
		
		        int choice = scanner.nextInt();
		
		        switch (choice) {
		            case 1:
		                System.out.print("Your current balance:" + person1.checkBalance());
		                break;
		            case 2:
		                System.out.print("Enter the amount: ");
		                int amount = scanner.nextInt();
		                person1.deposit(amount);
		                break;
		            case 3:
		                System.out.print("Enter the amount: ");
		                int amountWithdraw = scanner.nextInt();
		                person1.withdraw(amountWithdraw);
		                break;
		            case 4:
		                System.out.print("Enter the amount: ");
		                int transferMoney = scanner.nextInt();
		                person1.transfer(transferMoney, person2);
		                System.out.println(person2.name);
		                person2.checkBalance();
		                break;
		            case 5:
		                System.out.println("Exiting the website");
		                System.exit(0);
		            default:
		                System.out.println("Invalid");
		        }
		    }
	    } else {
	    	System.out.println("Logged in to your account to get account details");
	    }
		
	}
	
}

class Person {
	String name;
	int salary;

    public Person(String name, int salary) {
    	this.name= name;
        this.salary = salary;
    }

    public double checkBalance() {
        return salary;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            System.out.println("Deposited amout:" + (salary + amount));
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= salary) {
            System.out.println("Withdraw amount" + (salary - amount));
        } else {
            System.out.println("Insufficient amount");
        }
    }
    
    public void transfer(int amount, Person person) {
        int newBalance = salary - amount;
        if(newBalance > 0) {
            System.out.println("Transfered amount: " + newBalance);
            System.out.println("Amount added" + person.salary + amount);
        }
    }
	
}
