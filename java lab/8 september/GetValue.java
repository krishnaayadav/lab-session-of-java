 /* 
@PROGRAM: Written a program to find quotient and reminder taking input .
@author: krishna yadav
@date:  8 sep 2022
*/
 
class GetValue  // class been created
{
   public static void main(String args[]) // calling a main method 
   { 
     int divisor=Integer.parseInt(args[0]); // taking input  first from args
	 int divinded=Integer.parseInt(args[1]); //  taking input second from args
	 int q=divinded/divisor; // q is quotient of number
	 int r=divinded%divisor; // r is reminder of number
	 
	 System.out.println("the quotient is :" +q);
	 System.out.println("the reminder is :" +r);
	 } // end of main method
} // end of class getvalue	 