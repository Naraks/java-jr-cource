import java.util.*;

public class Sum2
{
	public static void main (String[] args)
	{
		if (args.length <= 1)
		{
			System.out.println("Error");
		}
		
		float sum = 0;		
		for (String i : args)
		{
			float a = Float.valueOf(i);			
			sum += a;
		}
		System.out.printf("%,.2f", sum);
	}	
}
