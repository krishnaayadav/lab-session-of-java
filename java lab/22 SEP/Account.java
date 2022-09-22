class Account
{
	//instance variable
	private String name;
	private int accountNo;
	private double balance;
	
	Account()// no arg constructor
	{
		
	}
	
	//paramaterized constructor
	Account(String name, int accountNo, double balance)
	{
		this.name=name;
		this.accountNo=accountNo;
		this.balance= balance;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setAccountNo(int accountNo)
	{
		this.accountNo=accountNo;
	}
	
	public int getAccountNo()
	{
		return this.accountNo;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
}