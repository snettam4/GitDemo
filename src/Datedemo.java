import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sf = new SimpleDateFormat("M/dd/yyyy hh/mm/ss");
		System.out.println(sdf.format(d));
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		

	}

}
