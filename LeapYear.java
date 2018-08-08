package program;

public class LeapYear 
{

	public static void main(String[] args)
	{
		int i;
		for (i=1901;i<=2018;i++)
		{
			if(i%4==0)
				System.out.println(i);
		}

	}

}
