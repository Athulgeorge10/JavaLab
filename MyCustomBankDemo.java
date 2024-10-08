package lab24;

import java.util.Scanner;

class MyCustomBank{
	Scanner sc = new Scanner(System.in);
	long accNo;
	String accName;
	String accType;
	int balance;
	
	void openAccount() {
		System.out.print("Enter Account No: ");
		accNo = sc.nextLong();
    	System.out.print("Enter Account Type: ");
    	accType = sc.next();
    	System.out.print("Enter Name: ");
    	accName = sc.nextLine();
    	sc.next();
    	System.out.print("Enter Initial Balance: ");
    	balance = sc.nextInt();
    	System.out.println("Account created successfully!");
    }
	
	void displayAccount() {
		System.out.println("Name of Account Holder: "+accName);
		System.out.println("Account No.:: "+accNo);
		System.out.println("Account Type: "+accType);
		System.out.println("Balance: "+balance);
	}
	
	void searchAccount() {
		System.out.print("Enter Account No to search: ");
		int ac = sc.nextInt();
		if(ac == accNo) {
			displayAccount();
		}
		else {
			System.out.println("Account No. does not exist");
		}
	}
	
	void deposit(){
		System.out.print("Enter Amount to Deposit: ");
		int depo = sc.nextInt();
		try {
			if(depo <= 0) {
				throw new InvalidAmountException("Invalid amount; must be greater than 0.");
			}
			balance += depo;
			System.out.println("Deposit successful! New balance: "+balance);
		}
		catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
	}
	
	void withdraw() {
		System.out.print("Enter Amount to Withdraw: ");
		int with = sc.nextInt();
		try {
			if(with <= 0) {
				throw new InvalidAmountException("Invalid amount; must be greater than 0.");
			}
			if(with > balance) {
				throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
			}
			balance -= with;
			System.out.println("Withdrawal successful! New balance: "+balance);
		}
		catch(InvalidAmountException e ) {
			System.out.println(e.getMessage());
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}


public class MyCustomBankDemo {
	public static void main(String[] args) throws InvalidAmountException, InsufficientBalanceException {
		char ch='y'; int opt;
		Scanner sc = new Scanner(System.in);
		MyCustomBank b = new MyCustomBank();
		do {
			System.out.println("\n*** Banking System Application ***");
            System.out.println("1. Open New Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Search Account");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            opt = sc.nextInt();
            
            switch(opt) {
	            case 1:
	            	b.openAccount();
	            	break;
	            
	            case 2:
	            	b.displayAccount();
	            	break;
	            	
	            case 3:
	            	b.deposit();
	            	break;
	            
	            case 4:
	            	b.withdraw();
	            	break;
	            
	            case 5:
	            	b.searchAccount();
	            	break;
	            	
	            case 6:
	            	ch = 'n';
	            	System.out.print("Thank you for using the banking system. See you soon!");
	            	break;
	            
	            default:
	            	System.out.println("Invalid Option!");
            }
            
		}while(ch == 'y' || ch == 'Y');
		System.out.println("\n\n*********************************");
		System.out.println("Thank You :) Visit again");
		System.out.println("*********************************");
	}
}
