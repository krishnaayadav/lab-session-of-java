 /* 
@PROGRAM: Written a program to print the stars pattern
@author: krishna yadav
@date:  15 sep 2022
*/




 
class StarsPattern // declaring a class 
{
static void pattern(int noOfRows) // using static method 
    
	{
		for(int i=1;i<=noOfRows;i++) // outer loop for my rows
		{
			System.out.println(); // new line after each row
			
			for(int spaces=noOfRows;spaces>i;spaces--) // inner for loop for spaces
			{
				System.out.print(" "); // print the sapce for each star 
			}
			
			for(int j=1;j<=i;j++) // another loop for adjust column which they print star
			{
				System.out.print("* "); // printing star 
			}
			
			
		} // end of inner loop
		
		
	} // end of outer loop
	public static void main(String... args) // calling main method
   {
	 
	  int number =Integer.parseInt(args[0]);
	  pattern(number);
      
   }


} // end of class
	