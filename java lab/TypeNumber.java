 /* 
@PROGRAM: Written a program to sum of even and odd number
@author: krishna yadav
@date:  1 sep 2022
*/

import java.util.Scanner;
class TypeNumber {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i, EvenSum = 0, OddSum = 0;;
		sc = new Scanner(System.in);
	 
		System.out.print("Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print("Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
		
		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 0)
			{
				EvenSum = EvenSum + a[i]; 
			}
			else
			{
				OddSum = OddSum + a[i]; 
			}
		}		
		System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
		System.out.println(" The Sum of Odd Numbers in this Array = " + OddSum);
	}
}