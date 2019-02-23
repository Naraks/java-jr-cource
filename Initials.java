import java.util.*;

public class Initials {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your full name");
		String fullName = scanner.nextLine();
		String[] arr = fullName.split(" ");
		System.out.print("Your initials are: ");		
		for (String s : arr) 
		{
			System.out.print(s.charAt(0) + ".");		
		} 
	}
}
