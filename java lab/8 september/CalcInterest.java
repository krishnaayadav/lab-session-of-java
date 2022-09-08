 /* 
@PROGRAM: Written a program to calculate simple interest(SI=p*r*t).
@author: krishna yadav
@date:  8 sep 2022
*/
 
class CalcInterest  // class been created as CalcInterest
{
   public static void main(String args[]) // calling a main method 
   { 
     float P= Float.parseFloat(args[0]); // taking input from user to command line 
	 float R= Float.parseFloat(args[1]); // taking input from user to command line
	 float T=5; // alredy given time value
	 
	 float SI=(P*R*T)/100; // formula to find a simple interest amount*rateofinterest*period/100.
	 
	 System.out.println("the simple interest is =" +SI); // printing the simple interest
	 } // end of main method 
} // end of class method CalcInterest	 