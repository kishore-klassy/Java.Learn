/*  Question Statement :
        Vasya likes the number 239.Therefore, he considers a number 
		pretty if its last digit is 2,3 or 9 .
		Vasya wants to watch the numbers between L and R (both inclusive),
		so he asked you to determine how many pretty numbers are in this
		range. Can you help him?
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class PrettyNumberCC
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Testcase You Want :");
		int t = sc.nextInt();
		while(t>0){
		System.out.println("Enter the Starting number :");
		int l = sc.nextInt();
		System.out.println("Enter the End number :");
		int r = sc.nextInt();
		int count = 0 ;
		for(int i=l;i<=r;i++){
		    int a = i%10;
		    if(a==2 || a==3 || a==9){
		        count++ ;
		    }
		}
		
		System.out.println("There are "+ count+ " Pretty Numbers in the Given Range");
		t-- ;
	}
}
}