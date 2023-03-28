import java.util.*;
import java.lang.*;
import java.io.*;
class StringReverse{
		
		
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String :");
		String str = sc.nextLine();
		String[] words_array = str.split(" ");
		
		System.out.println("Select the Operation:");
		System.out.println("1.wordByWordReversing");
		System.out.println("2.LetterByLetterReversing");
		System.out.println("3.Reverse of letters but not words");
		int t = 3;
		while(t>0){
		int option = sc.nextInt();
		switch(option){
			case 1 : {
				System.out.println("Reverse Word by Word");
				for(int i=words_array.length-1;i>=0;i--){
					System.out.print(words_array[i]+" ");//wordByWordReversing
				}
				break;
			}
			case 2 :{
				System.out.println("Letter by Letter Reversing");
				for(int i=str.length()-1;i>=0;i--){
					System.out.print(str.charAt(i));//LetterByLetterReversing
				}
				break;
			}
			case 3 :{
				System.out.println("Reverse of letters but not words");
				for(int i=0;i<words_array.length;i++){
					for(int j=words_array[i].length()-1;j>=0;j--){
						String word =words_array[i];
						System.out.print(word.charAt(j)+" ");
					}
				}
				break;
			}
		}
		t-- ;
		}
	}
	
}