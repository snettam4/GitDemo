package coreJava;

public class Schild extends Sparent
{
	String name = "Academy";
	public Schild()
	{
		super();
		System.out.println("I am a child class constructor");
	}
    public void getStringdata()
    {
    	System.out.println(name);
    	System.out.println(super.name);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Schild sc = new Schild();
		sc.getStringdata();
		sc.getData();
		

	}

}
