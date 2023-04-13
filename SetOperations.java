import java.util.*;
import java.lang.*;
import java.io.*;

class SetOperations{

 public int[] intersection(int arr1[],int arr2[],SetOperations obj){
	int[] intersection = new int[arr1.length] ;
	int k = 0 ;
	System.out.print("The intersection element are : ");
	for(int i =0;i<arr1.length;i++){
		for(int j=0;j<arr2.length;j++){
			if(arr1[i]==arr2[j]) {
				intersection[k] = arr1[i] ;
				obj.displayIntersection(intersection[k]) ;
				k++ ;
			}
	}
	
 }
 return intersection ;
 }
 
 public void displayIntersection(int element){
		System.out.print(element+",");
		
 }
 public void displayUnion(int[] unionArray){
	 
	 
	for(int element : unionArray){
		System.out.print(element+",");
	}
	 
 }
 public int[] union(int[] arr1,int[] arr2){
	 
	int[] unionArray = new int[arr1.length+arr2.length];
	int k = 0 ;
	for(int element : arr1){
		unionArray[k] = element ;
		k++ ;
	}
	for(int element : arr2){
		unionArray[k] = element ;
		k++ ;
	}
	return unionArray ;
		 
}

 public static void main(String[] args){
	
	int[] arr1 = {3,2,43,56,54} ;
	int[] arr2 = {43,34,45,34,2} ;
	SetOperations obj = new SetOperations();
	int[] intersection = obj.intersection(arr1,arr2,obj) ;
	System.out.println(" ");
	System.out.print("Union elements are :");
	obj.displayUnion(obj.union(arr1,arr2));
 } 

}
