import java.io.*;
import java.util.*;
import java.lang.*;

class BillItem {
	public int slNo;
    public int quantity;
    public Item menuItem;

    BillItem(int slNo, int quantity, Item item) {
        this.slNo = slNo;
        this.quantity = quantity;
        this.menuItem = item;
    }
	BillItem(){
		
		
	}

    public double getTotal() {
        return this.quantity * this.menuItem.rate;
    }

    public void display() {
        System.out.println(String.format(" %d\t%s\t%.2f\t %d\t\t%.2f", this.slNo, this.menuItem.name, this.menuItem.rate , this.quantity, this.getTotal()));		
    }
}