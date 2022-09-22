/*
Program: written a program to display a accout in bank 
@author: krishna yadav 
@Date: 22 sep 2022
*/
class Bank // creating a class bank
{
	//main method
	public static void main(String ...args)
	{
		//----,,,,,Constructor,,,,,,------//
		
		//declaring objects of Account class
		Account acc1= new Account("krishna",543211,4500.00);
		
		Account acc2= new Account("kundan",543212,3000.78);
		
		Account acc3= new Account("kushal",543213,1000.00);
		
		
		
		
		// display the all account names and balance
		System.out.println("Name:  "+acc1.getName()+" AccountNo:   "+acc1.getAccountNo()+"  Balance:  "+acc1.getBalance());
		System.out.println();
		System.out.println("Name:  "+acc2.getName()+"  AccountNo:   "+acc2.getAccountNo()+"  Balance:  "+acc2.getBalance());
		System.out.println();
		System.out.println("Name:  "+acc3.getName()+"  AccountNo:   "+acc3.getAccountNo()+"  Balance:  "+acc3.getBalance());
		System.out.println();
		
		
		//--------,,,,,,Getter Setter,,,,,,----------//
		
		//declaring objects
		Account acc4= new Account();
		
		//setting the values of the object
		acc4.setName("ram");
		acc4.setAccountNo(543214);
		acc4.setBalance(999.99);
		   
		   
		//declaring objects
		Account acc5= new Account();
		
		//setting the values of the object
		acc5.setName("subham");
		acc5.setAccountNo(543215);
		acc5.setBalance(750.00);
		
		//declaring objects
		Account acc6= new Account();
		
		//setting the values of the object
		acc6.setName("shyam");
		acc6.setAccountNo(543216);
		acc6.setBalance(859.99);
		
		//getting the values
		System.out.println("Name:  "+acc4.getName()+"   AccountNo:   "+acc4.getAccountNo()+"  Balance:  "+acc4.getBalance());
		System.out.println();
		System.out.println("Name:  "+acc5.getName()+"   AccountNo:   "+acc5.getAccountNo()+"  Balance:  "+acc5.getBalance());
		System.out.println();
		System.out.println("Name:  "+acc6.getName()+"   AccountNo:   "+acc6.getAccountNo()+"  Balance:  "+acc6.getBalance());
		
	}
}