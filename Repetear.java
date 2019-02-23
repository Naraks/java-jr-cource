public class Repetear 
{
	public static void main(String[] args)
	{
		if (args.length != 1) 
		{
			System.out.println("Error");		
		}
		else
		{
			for (int i = 0; i < args[0].length(); i++)
			{
				System.out.print(args[0].substring(i, i + 1).toUpperCase());				
				for (int n = 0; n < i; n++)
				{
					System.out.print(args[0].substring(i, i + 1).toLowerCase());
				}
				if (i != args[0].length() - 1)
				{
					System.out.print("-");
				}
			}
		}	

	}
}
