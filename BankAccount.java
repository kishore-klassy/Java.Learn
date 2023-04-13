import java.util.*;
import java.lang.*;
import java.io.*;
class BankAccount{
	Scanner sc = new Scanner(System.in);
	private long account_number;
	private String name;
	private long balance;
	
	BankAccount(long account_number,String name,long balance){
		this.account_number=account_number;
		this.name = name;
		this.balance=balance;
	}
	
	public void chooseOption(){	
		int t=5 ;
		do{
		System.out.println("1.DEPOSIT");
		System.out.println("2.WITHDRAW");
		System.out.println("3.BALANCE");
		System.out.println("4.Exit");
		System.out.println("-----Enter the option-----");
		
		int option = sc.nextInt();
		switch(option){
			case 1 : this.deposit();
					 break ;
			case 2 : this.withdraw() ;
					 break ;
			case 3 : this.checkBalance();
					 break ;
			case 4 : return ;
		}
		t-- ;
		}
		while(t>=0) ;
	}
	public long deposit(){
		
		System.out.println("Enter amount to DEPOSIT : ");
		long depositAmount = sc.nextInt();
		balance = depositAmount + this.balance ;
		return balance ;
	}
	
	
	public long withdraw(){
		
		System.out.println("Enter amount to WITHDRAW: ");
		long withdrawAmount = sc.nextInt();
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
