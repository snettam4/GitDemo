
public class Strings {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "Payment $100 Paid";
		System.out.println(str.charAt(8));
		String str1 = "Payement $100 Paid";
		System.out.println(str1.indexOf("$"));
		String str2 = "Payement $100 Paid";
		System.out.println(str2.substring(9));
		
		String str3 = "madam";
		String t ="";
		for(int i=str3.length()-1;i>=0;i--)
		{
			t=t+str3.charAt(i);
			
		}
		System.out.println(t);
		
		if(t==str3)
		{
			System.out.println("This is polindrome");
		}
		else
		{
			System.out.println("This is not polindrome");
		}
		
		

	}

}
