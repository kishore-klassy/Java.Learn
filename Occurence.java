import java.util.*;
import java.lang.*;
import java.io.*;
class Occurance{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	
	for(int i=0;i<str.length();i++){
		int count = 0 ;
			for(int j=0;j<str.length();j++){
					if(str.charAt(i)==str.charAt(j)){
						count++ ;
					}	
			}
			System.out.println(str.charAt(i)+" is Occured "+count+" times");

	}	
	}
}
