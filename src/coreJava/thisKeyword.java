package coreJava;

public class thisKeyword 
{
	int a = 5;//global variable means class level variable
	public void getData()
	{
		int a=3;//this is method level variable
		int c =this.a+a;//gives sum of local variable and global variable
		//int b=this.a;//used to print the global variable using this keyword
		System.out.println(c);
	}

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		thisKeyword tk = new thisKeyword();
		tk.getData();

	}

}
