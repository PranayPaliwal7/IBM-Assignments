package com.ibm.bank.ui;
import java.util.*;
import java.sql.*;
import com.ibm.bank.bean.*;
import com.ibm.bank.service.XYZBankServiceClass;
import com.ibm.bank.service.XYZBankServiceInterface;

public class ParallelProject {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		XYZBankServiceInterface service = new XYZBankServiceClass();
		String Name;
		String Email;
		int Pin;
		
		try {
		while(true){
			XYZBank XYZBank = new XYZBank();
			System.out.println("Press 1. Create Account");
			System.out.println("Press 2. Show Balance");
			System.out.println("Press 3. Fund Transfer");
			System.out.println("Press 4. Withdraw Money");
			System.out.println("Press 5. Deposit Money");
			int choice = sc.nextInt();
			switch(choice) {
			case(1):
				System.out.println("Enter your Name");
				Name=sc.next();
				System.out.println("Enter your Email ");
				String Email1=sc.next();
				System.out.println("Enter Pin of 4 digit number ");
				int Pin1=sc.nextInt();
				System.out.println("Enter the amount you want to add to the account");
				int amount1=sc.nextInt();
//				XYZBank.setEmail(Email1);
//				XYZBank.setName(Name);
//				XYZBank.setPin(Pin1);
//				XYZBank.setAmount(amount);
				service.insertData(Name,Email1,Pin1,amount1 );
				break;
			case(2):
				System.out.println("Enter the Email ID");
				String Email2 = sc.next();
				System.out.println("Enter the Pin");
				int Pin2 = sc.nextInt();
				//XYZBank.setEmail(Email);
				//XYZBank.setPin(Pin);
				service.ShowBalance(Email2, Pin2 );
				break;
			case(3):
				System.out.println("Enter the Email ID");
				String Email3 = sc.next();
				System.out.println("Enter Pin");
				int Pin3=sc.nextInt();
				System.out.println("Logged in successfully");
				System.out.println("Enter the Email ID of the user into which you want to transfer money");
				String EmailReciever= sc.next();
				System.out.println("Enter the amount");
				int amount2=sc.nextInt();
				service.FundTransfer(Email3, Pin3, EmailReciever, amount2);
				break;
			case(4):
				System.out.println("Enter the Email ID");
				String Email4 = sc.next();
				System.out.println("Enter Pin");
				int Pin4=sc.nextInt();
				System.out.println("Logged in successfully");
				System.out.println("Enter the amount you want to withdraw");
				int amount3= sc.nextInt();
				service.WithdrawMoney(Email4, Pin4, amount3);
				break;
			case(5):
				System.out.println("Enter the Email ID");
				String Email5 = sc.next();
				System.out.println("Enter Pin");
				int Pin5=sc.nextInt();
				System.out.println("Logged in successfully");
				System.out.println("Enter the amount you want to deposit");
				int amount4=sc.nextInt();
				service.DepositMoney(Email5, Pin5, amount4);
				break;
			default:
				System.out.println("Try Again!");
				break;
			}
		}
	}
		catch(Exception e) {
			e.getMessage();
		}
	}

}

