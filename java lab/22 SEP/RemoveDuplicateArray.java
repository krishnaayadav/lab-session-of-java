/*
Program: written a program to  find and remove dublicates array entries. 
@author: krishna yadav 
@Date: 22 sep 2022
*/
import java.util.Scanner; // taking scanner class
import java.util.Arrays; // taking a array class

class RemoveDuplicateArray // creating a class removeDuplicatearray
{
	static void takeArray() // using a static method 
	{
		Scanner sc= new Scanner(System.in); // input scanner class
		System.out.println("Enter the number of elements:");
		int value= sc.nextInt();
		
		
		int arry[]= new int[value]; // taking a array with input value
		
		System.out.println("Enter the elements:"); 
		
		
		for(int i=0;i<value;i++) // print a array 
		{
				
	     	arry[i]= sc.nextInt();
			
			
		}
		
        Arrays.sort(arry); // sorting the elements		

		System.out.println();
		
		System.out.println("Array elements are:");
         displayArray(arry);
		
		System.out.println();
		
		System.out.println(" After a Removing Duplicate elements:");
        removeDuplicate(arry);
		
	}
	static void displayArray(int myArray[]) // display the array 
	{
		
	   System.out.println(); // to space in line
	
		for(int myvalue:myArray)
		{
		 System.out.print(myvalue+ "  ");
					
		}
		
	}
   
	
   static void removeDuplicate(int removeArray[]) // to removing the array
   {
	   int size= removeArray.length; // size is less after removing
	   int new_size;  // print a new size
	   if(size==0||size==1)
		   new_size=size;
	   
	   int temp[] = new int[size]; // taking a temporary value fir removing a aaray
	   int j=0;
	   for(int i=0;i<size-1;i++)
	   {
		   if(removeArray[i]!=removeArray[i+1])
		   {
			   temp[j++]=removeArray[i];
		   }
	   }
	   temp[j++]=removeArray[size-1];
	   
	   //changing original array
	   for(int i=0; i<j;i++)
	   {
		   removeArray[i]= temp[i];
	   }
	   
	   
	   //printing after removing duplicate entries
	   
	   for(int i=0;i<j;i++)
	   {
		   System.out.print(removeArray[i]+"  ");
	   }
   }

   public static void main(String ...args)  // calling main method 
  {

     takeArray();

  } // end of main method


} // end of class  