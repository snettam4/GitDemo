package coreJava;

public class constructDemo {
	//Constructor will not return any values
	//name of the constructor will be the class name 
	//default constructor
	public constructDemo()
	{
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor lession1");
	}
	//parameterized constructor
	public constructDemo(int a,int b)
	{
		System.out.println("I am a parameterized constructor");
		int c = a+b;
		System.out.println(c);
	}
	
	public constructDemo(String str)
	{
		System.out.println(str);
	}
	
	public void getData()
	{
		System.out.println("I am the method");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		constructDemo cd = new constructDemo();
		constructDemo c = new constructDemo(4,9);
		constructDemo d = new constructDemo("hello");

	}

}
