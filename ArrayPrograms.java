import java.util.*;
import java.lang.*;
import java.io.*;
class ArrayPrograms{
	int sum = 0 ;
	int arraySum(int[] arr){	
		for(int element:arr){
			sum = sum + element ;
		}
		return sum ;
	}
	public int[] getArray(Scanner sc){
		System.out.println("Enter the number of elements :");
		int numOfElements = sc.nextInt() ;
		int[] arr = new int[numOfElements];
		for(int i=0;i<numOfElements;i++){
			arr[i]=sc.nextInt();		
		}
		return arr;
	}
	public void displaySum(int sum){
		
		System.out.println("The Sum is :"+sum);
		
	}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	ArrayPrograms obj = new ArrayPrograms() ;
	obj.displaySum(obj.arraySum(obj.getArray(sc)));
}

}
