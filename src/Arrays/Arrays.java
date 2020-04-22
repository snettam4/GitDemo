package Arrays;

public class Arrays {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int sum = 0;
		int c[] = {3,2,6,7,9};//allocating memory dynamically
		for(int i=0;i<c.length;i++)
		{
			//sum=sum+c[i];---this is used to print the sum
			if(c[i]==6)
			{
				System.out.println(i);//this is used to print the index of the number
				break;
			}
		
			
		}
		//System.out.println(sum);
	
	}

}
