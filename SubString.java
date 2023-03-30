import java.util.*;
import java.lang.*;
import java.io.*;
class SubString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		String[] str_arr = new String[150] ;
		int k=0;
		System.out.println("The SubString are : ");
		for(int m=1;m<=str.length();m++){
			for(int i=0;m+i<=str.length();i++){
				str_arr[k]= str.substring(i,i+m) ;
				k++ ;
			}
		}
		for(int i=0;str_arr[i]!=null;i++)
			System.out.print(str_arr[i] + " ,");
		
	}

}
