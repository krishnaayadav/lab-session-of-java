/*
PROGRAM: CHECK A NUMBER IS PALINDROM OR NOT 
@author: krishna yadav
@date: 16 august 2022 
*/
 class CheckNumber
 {
 static void checkpalindrome()
       {
	      int num=455528;
		  int r,num2=0;
		  
		  int temp= num;
		  while(num>0)
		  {
			    r=num%10;
				num2  =(num2*10)+r;
				num= num/10;
		  }
       if (num2==temp)
           System.out.println("----the number: "+ temp +" is a palindrome");		   
       else 
		   System.out.println("----the number: "+ temp +" is a not  palindrome");
 
 
	   }
 
 
 public static void main(String args[])
      {  
          checkpalindrome();
         }
 
 }
















 