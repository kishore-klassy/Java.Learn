import java.io.*;
import java.util.*;
import java.lang.*;
import java.time.*;

class Bill {
    public ArrayList<BillItem> items = new ArrayList<>();
    public int billNo;
    public String date;
	Scanner sc = new Scanner(System.in);
	
	Bill(int billNo,String date){
		
		this.billNo=billNo;
		this.date = date;
		
	}
	
	
	public void  addItem(){
		System.out.println("Enter Item  :");
		int itemNum = sc.nextInt();
		System.out.println("Quantity:");
		int quantity = sc.nextInt();
		BillItem billItem = new BillItem(this.items.size()+1,quantity,Main.menu.get(itemNum-1));
		this.items.add(billItem);
		//billItem.display();
	}
	
    public static final double GST_PERCENT = 0.18;

    public double getTotal() {
		double total = 0;
		for(BillItem billItem : this.items){
			total = total +  billItem.getTotal();
		}
		total = this.calculateGST(total) + total;
		return total;
		
    }

    public double calculateGST(double total) {
		return total*GST_PERCENT ;

    }


    public void display() {
		System.out.println("--------------------------------------------------");
        System.out.println(String.format("bill no.:\t%d", this.billNo));
		LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date and Time: " + currentDate);
        //for loop
		System.out.println(" S.no\tItem\tRate\tQuantity\tCost");
		System.out.println(" ");
		for(BillItem billItem : this.items){
			billItem.display();	
		}
		System.out.println("--------------------------------------------------");
		System.out.println("\t\t\tTotal amout to PAY :"+this.getTotal());
		System.out.println("---------------------------------------------------");

	}
	 
	
}