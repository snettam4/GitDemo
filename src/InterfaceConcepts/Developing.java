package InterfaceConcepts;

public class Developing implements BankingInterface,DomainClient{
	//this class is responsible for implementing all the methods in the interface

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Developing d = new Developing();
		d.CheckBalance();
		d.PayCredit();
		d.TransferBalance();
		BankingInterface bi = new Developing();//this bi return type is responsible only to call BankingInterface methods.
		DomainClient dc = new Developing();//this is called runtime polymorphism
		dc.Investment();
		

	}

	@Override
	public void PayCredit()
	{
		// TODO Auto-generated method stub
		System.out.println("Paycredit implemented");
		
	}

	@Override
	public void TransferBalance() 
	{
		// TODO Auto-generated method stub
		System.out.println("TransferBalance implemented");
		
	}

	@Override
	public void CheckBalance() 
	{
		// TODO Auto-generated method stub
		System.out.println("CheckBalance implemented");
		
	}
	
	public void Login()
	{
		System.out.println("Login Successful");
	}

	@Override
	public void Investment() 
	{
		// TODO Auto-generated method stub
		System.out.println("Investments completed");
		
	}


}
