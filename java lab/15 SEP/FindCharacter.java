 /*
@Program: write a program to print a character is alphabet or number or digit .
@author: krishna yadav
@date : 15 sep
*/
 import java.util.Scanner; // using scanner class 
 class FindCharacter // declaring a class 
	{
	  static void findCharcter()  // using static method 
	  
	{
      System.out.println("Enter a character :");  // taking input from user 
      Scanner sc = new Scanner(System.in); // creating a object of scanner
      char ch = sc.next().charAt(0);    //calling as character
      int ascii = ch;	       //integer taking to  ascii value
	{
	   // using if else ladder
	  if(ch>='a'&& ch<='z') 
	     System.out.println(ch + "-is small albhabet");
		  else if(ch>='A' && ch<='Z')
			          System.out.println(ch  + "-is capital alphabet");
			     else if(ch>='0' && ch<='9')
					 System.out.println(ch + "-is a digit");
				     else  
						 System.out.println(ch + "-is a special character");
			
			 if(ascii==ch)
			        System.out.println(ascii + "-is the ascii value");
	} // end of ifelse ladder
	
	
	}
	
	        public static void main(String[] args)// calling a main aethod
			 
			 {
				findCharcter(); 
				 
			 }
			 
	} // end of class