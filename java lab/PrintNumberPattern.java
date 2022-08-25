 /*
@Program: pritning the pattern of number 
@author: krishna yadav
@date : 25 aug
*/
 
 import java.util.Scanner;
 class  PrintNumberPattern//// class definition
{
   static void PrintPattern()
    {
        //creating object of Scanner class 
        Scanner s = new Scanner(System.in);
        //Taking input of number of elements in the series
        System.out.println("Enter the value of number want to print pattern to that number ");
        int n = s.nextInt();
        //for loop to print the pattern
        for (int i = 1; i <= n; i++) 
        {
            for (int j =1; j <= i;++j) 
            {
                System.out.print(j + " ");
            }
              System.out.println();
        }             
    }
	public static void main(String [] args)
	{
		PrintPattern();
	}
}
