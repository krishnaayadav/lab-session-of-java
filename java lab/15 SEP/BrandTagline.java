/* 
@PROGRAM: Written a program to print tagline of brands 
@author: krishna yadav
@date:  15 sep 2022
*/

class BrandTagLine  // declaring a class 
 { 
    static void BrandTagLine() // using static method 
	{ 
	     String tagline ="Nike"; 
		 switch (tagline)
	 
		 {
			 
			   case"Nike" -> System.out.println("just do it");  // nike then print 
			      
			  case"Puma" ->  System.out.println("FOREVER FASTER IS ALWAYS FIRST, NEVER SECOND, NEVER THIRD");
                  
              case"Adidas" ->  System.out.println("Adidas is all in");
                 
              case"Apple" ->  System.out.println("Think Different");
                  
              case"Boost" ->  System.out.println("Love Life");
                 
				default ->  System.out.println("wrong input");  
		 }
    } // end of switch case
     public static void main(String ...args) // calling main method
	 { 
	     BrandTagLine(); 
	 }  // end of class
	 
 } 