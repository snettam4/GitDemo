package Arrays;

public class InterviewMinValue {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*int a[][]=new int[2][3];//traditional multi dimensional array
		int min = a[0][2];
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
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
				
			}
		System.out.println(min);*/
		int a[][]= {{2,3,4},{6,5,7},{8,7,1}};//print min number
		int min = a[0][0];
		int minimumcolumn=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)//2
				{
					min=a[i][j];
					minimumcolumn=j;
				}
			}
		}
		int k =0;
		int max=a[0][minimumcolumn];
		while(k<3)
		{
			if(a[k][minimumcolumn]>max)
			{
				max=a[k][minimumcolumn];
			}
			k++;
		}
		System.out.println(max);
	}

}
