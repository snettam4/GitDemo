package Arrays;

public class MultipleDimensionalArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[][]=new int[2][3];//traditional multi dimensional array
		a[0][0]=8;
		a[0][1]=11;
		a[0][2]=9;
		a[1][0]=10;
		a[1][1]=90;
		a[1][2]=45;
		for(int i=0;i<2;i++)//represents row
		{
			for(int j=0;j<3;j++)//represnts column
				
			{
				System.out.println(a[i][j]);
			}
			
		}
		//System.out.println(a[0][2]);
		
		//int b[][]= {{2,3,4},{6,5,7},{8,7,2}};//most used way
		//System.out.println(b[2][0]);
		
		
	
	}

}
