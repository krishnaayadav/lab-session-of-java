 /*
@Program: write a program to find the largest number.
@author: krishna yadav
@date : 25 aug
*/

import java.util.Scanner;
class  FindNumber // class definition
{
   static void printnum()
    {
		int size;//variable declaration for size of array
int firstNum=0, secondNum=0;
//Using scanner class
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number of element: ");
size=scan.nextInt();//taking input from user for size of array
int arr[]=new int[size];//declaration of array
for(int i=0; i<size; i++){
    System.out.print("Enter the array element "+(i+1)+" :");
arr[i]=scan.nextInt();//taking input for array elements
if(firstNum<arr[i]){
secondNum=firstNum;
firstNum=arr[i];
}
else if(secondNum<arr[i]){
secondNum=arr[i];
}
  }
  System.out.println("the largest number is:"+ firstNum);
  System.out.println("the second largest number is:"+ secondNum);
 }
 public static void main(String ...args)
 {
 printnum();
 }
 
}