import java.util.*;
import java.io.*;
import java.lang.*;
import java.time.*;

public class Main {
	
    public int lastBillNo = 0;
    public static ArrayList<Item> menu= new ArrayList<>();
	
	public BillItem billItem;
	
	
	
	public static void displayMenu(){
		System.out.println(" S.no\tItem\tRate");
		System.out.println(" ");
		for(int i=0;i<Main.menu.size();i++){
			System.out.println(" "+(i+1)+"\t"+Main.menu.get(i).name+"\t"+Main.menu.get(i).rate);			
		}
		
	}
	
	
    public static void main(String[] args) {
        Main.menu.add(new Item("Idly",5.00,true));
        Main.menu.add(new Item("dosai",15.00,true));
        Main.menu.add(new Item("vada",5.00,true));
        Main.menu.add(new Item("pongal",20.00,true));
		Scanner sc = new Scanner(System.in);
        Bill bill = new Bill(1,"18-4-2023");
		int t=5;
		int option ;
		while(t>=0){
				
			System.out.println("1.Add Item");
			System.out.println("2.Finalize Items");
			option = sc.nextInt();
				switch(option){
					case 1 : Main.displayMenu();
							 bill.addItem();
							 System.out.println("Item Added Succcessfully");
							 break;
				
					case 2 : bill.display();
			
				}	
		t-- ;
		} 
    }
}