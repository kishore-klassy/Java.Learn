import java.util.*;
import java.lang.*;
import java.io.*;
class BankAccount{
	Scanner sc = new Scanner(System.in);
	private double account_number;
	private String name;
	private double balance;
	
	BankAccount(double account_number,String name,double balance){
		this.account_number=account_number;
		this.name = name;
		this.balance=balance;
	}
	
	public void chooseOption(){	
		for(int i = 0 ;i<=5;i++){
		System.out.println("1.DEPOSIT");
		System.out.println("2.WITHDRAW");
		System.out.println("3.BALANCE");
		System.out.println("4.Exit");
		System.out.println("-----Enter the option-----");
		
		int option = sc.nextInt();
		switch(option){
			case 1 : this.deposite();
					 break ;
			case 2 : this.withdraw() ;
					 break ;
			case 3 : this.checkBalance();
					 break ;
			case 4 : return ;
		}
		}
	}
	public double deposite(){
		
		System.out.println("Enter amount to DEPOSIT : ");
		double depositAmount = sc.nextInt();
		balance = depositAmount + this.balance ;
		return balance ;
	}
	
	
	public double withdraw(){
		
		System.out.println("Enter amount to WITHDRAW: ");
		double withdrawAmount = sc.nextInt();
		balance = this.balance - withdrawAmount ;
		return withdrawAmount ;
		
	}
	
	public void checkBalance(){	
		System.out.println("Your Account Balance is : "+this.balance);
	}
	
	public static void main(String[] args){
		
		BankAccount account1= new BankAccount(21638,"kishore",1000);
		account1.chooseOption();
		
	
	}
}